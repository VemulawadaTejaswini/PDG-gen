import java.io.*;
public class Main {
	static public void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++){
			String sl=br.readLine();
			String ss=br.readLine();
			if (ss.length()>sl.length()){
				String tmp=sl;
				sl=ss;
				ss=tmp;
			}
			char[] cl=sl.toCharArray();
			char[] cs=ss.toCharArray();
			int[] length=new int[cs.length];
			int[] position=new int[cs.length];
			for (int j=0;j<cs.length;j++){
				position[j]=myfind(cl,cs[j],0);
				if (position[j]!=-1) length[j]=1;else length[j]=0;
				for (int k=0;k<j;k++){
					int tmpp=myfind(cl,cs[j],position[k]+1);
					if (tmpp!=-1){
						if (length[k]+1>length[j]){
							length[j]=length[k]+1;
							position[j]=tmpp;
						}else if(length[k]+1==length[j]&&tmpp<position[j]) position[j]=tmpp;
					}
				}
			}
			int max=0;
			for (int j=0;j<cs.length;j++) if (length[j]>max) max=length[j];
			System.out.println(max);
		}
	}
	public static int myfind(char[] c,char t,int p){
		for (;p<c.length;p++){
			if (c[p]==t) return p;
		}
		return -1;
	}
}