import java.io.*;

class Main{
	public static void Triangle(int[] data){
		int a,b,c,d;
		a=(int)Math.pow(data[0],2);
		b=(int)Math.pow(data[1],2);
		c=(int)Math.pow(data[2],2);
		d=(int)Math.sqrt(a+b);
		if(d==data[2]){
			System.out.println("YES");
		}
		else if((d=(int)Math.sqrt(a+c))==data[1]){
			System.out.println("YES");
		}
		else if((d=(int)Math.sqrt(b+c))==data[0]){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String str[]=new String[3];
		int N,i;
		int Line[]=new int[3];
		i=1;
		N=Integer.parseInt(in.readLine());
		while(i<=N){
			str=(in.readLine()).split(" ",0);
			for(int j=0;j<=2;j++){
				Line[j]=Integer.parseInt(str[j]);
			}
			Triangle(Line);
			i++;
		}
	}
}