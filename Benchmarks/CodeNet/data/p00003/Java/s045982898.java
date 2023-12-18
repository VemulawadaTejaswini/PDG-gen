import java.io.*;

class Main{
	public static void main(String[] args){
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String str[]=new String[3];
		int N,i;
		int Line[]=new int[3];
		i=1;
		N=int(in.readLine());
		while(i<=N){
			str=in.readLine().split(" ",0);
			for(int j=0;j<=2;j++){
				Line[i]=Integer.parseInt(str[i]);
			}
			if(((Line[0]^2)+(Line[1]^2))==Line[2]^2){
				System.out.println("YES");
			}
			else if(((Line[1]^2)+(Line[2]^2))==Line[0]^2){
				System.out.println("YES");
			}
			else if(((Line[0]^2)+(Line[2]^2))==Line[1]^2){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			i++;
		}
	}
}