import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int c=0,f=0;
		int[] p = new int[2];
		int n=Integer.parseInt(bf.readLine());
		while(n-->0){
			String[] d=bf.readLine().split(" ");p[0]=p[1]=0;
			for(int i=0;i<10;i++){
				c=Integer.parseInt(d[i]);
				f=(p[0]<p[1])?1:0;
				if(p[f]<c){
					p[f]=c;
				}else if(p[(f==1?0:1)]<c){
					p[(f==1?0:1)]=c;
				}else{
					System.out.println("NO");
					break;
				}
				if(i==9)System.out.println("YES");
			}
		}
	}
}