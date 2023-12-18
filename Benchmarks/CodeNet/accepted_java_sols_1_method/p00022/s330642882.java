import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int[] s = new int[5000];
		int[] m = new int[5000];
		int n,t,x;
		while((n=Integer.parseInt(bf.readLine()))!=0){
			for(int i=0;i<n;i++){
				s[i]=m[i]=t=Integer.parseInt(bf.readLine());
				for(int j=0;j<i;j++){
					s[j]+=t;
					if(m[j]<s[j])m[j]=s[j];
				}
			}
			x=m[0];for(int i=1;i<n;i++)if(x<m[i])x=m[i];
			System.out.println(x);
		}
	}
}