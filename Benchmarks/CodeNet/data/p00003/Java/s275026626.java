import java.io.*;

class Main{
	public static void Triangle(int[3] data){
		int a,b,c,d;
		a=Math.pow(data[0],2);
		b=Math.pow(data[1],2);
		c=Math.pow(data[2],2);
		d=Math.sqrt(a+b);
		if(d==data[2]){
			System.out.println("YES");
		}
		d=Math.sqrt(a+c);
		else if(d==data[1]){
			System.out.println("YES");
		}
		d=Math.sqrt(b+c);
		else if(d==data[0]){
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