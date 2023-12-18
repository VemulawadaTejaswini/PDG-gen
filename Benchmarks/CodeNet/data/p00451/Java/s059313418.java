
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	/**
	 * @param args 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String ss = br.readLine();
			if(ss.equals(""))break;
			String tt = br.readLine();
			int[]s = new int[ss.length()];
			int[]t = new int[tt.length()];
			for(int i=0;i<s.length;i++){
				s[i] = ss.charAt(i);
			}
			for(int i=0;i<t.length;i++){
				t[i] = tt.charAt(i);
			}
			SuffixArray sa = new SuffixArray(s);
			int left=-1,right=t.length+1;
			while(left<right-1){
				int len= (left+right)/2;
				boolean f = false;
				int[] sub = new int[len];
				for(int i=0;i<t.length;i++){
					if(i+len>t.length)break;
					for(int k=i;k<i+len;k++){
						sub[k-i]=t[k];
					}
					if(sa.contain(sub)){
						f=true;
						break;
					}
				}
				if(f){
					left=len;
				}
				else{
					right=len;
				}

			}
			System.out.println(left);
		}
	}

	static class SuffixArray {

		int n,k=1;
		Integer[] sa,rank,tmp;
		int[] s;

		SuffixArray(int[] _s) {
			s=_s;
			n = s.length;
			rank=new Integer[n+1];
			sa=new Integer[n+1];
			tmp=new Integer[n+1];
			for(int i=0;i<n;i++){
				sa[i]=i;
				rank[i]=s[i];
			}
			sa[n]=n;
			rank[n]=-1;

			for(k=1;k<=n;k<<=1){
				Arrays.sort(sa,new Comparator<Integer>(){
					@Override
					public int compare(Integer o1, Integer o2) {
						int r1=rank[o1];
						int r2=rank[o2];
						if(r1!=r2)return r1-r2;
						int r11=o1+k <= n ? rank[o1+k] : -1;
						int r22=o2+k <= n ? rank[o2+k] : -1;

						return r11-r22;
					}
				});
				tmp[sa[0]]=0;
				for(int i=1;i<=n;i++){
					tmp[sa[i]]=tmp[sa[i-1]]+ (compare(sa[i-1],sa[i])!=0?1:0);
				}
				for(int i=0;i<=n;i++){
					rank[i]=tmp[i];
				}
			}
		}

		/*
		 * s.contains(t)的な
		 */
		boolean contain(int[] t){
			return contain(s,sa,t);
		}

		private boolean contain(int[]s,Integer[] sa,int[] t){
			int a=0,b=s.length;
			while(b-a>1){
				int c = (a+b)/2;
				//			String sub = s.substring(sa[c], Math.min(sa[c]+t.length, s.length));
				if(compare(s,sa[c],Math.min(sa[c]+t.length, s.length),t)<0){
					a=c;
				}
				else{
					b=c;
				}
			}
			return compare(s,sa[b], Math.min(sa[b]+t.length, s.length),t)==0;
		}

		/*
		 * s.substring(i1,i2).compareTo(t) 的な
		 */
		private int compare(int[]s,int i1,int i2,int[] t){
			for(int i=i1;i<i2;i++){
				if(i-i1>=t.length){
					return 1;
				}
				if(s[i]!=t[i-i1]){
					return s[i]-t[i-i1];
				}
			}
			return (i2-i1)-t.length;
		}

		private int compare(Integer o1, Integer o2) {
			int r1=rank[o1];
			int r2=rank[o2];
			if(r1!=r2)return (r1-r2);
			int r11=o1+k <= n ? rank[o1+k] : -1;
			int r22=o2+k <= n ? rank[o2+k] : -1;

			return (r11-r22);
		}
	}
}