import java.io.*;

class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] num=str.split(" ");
		
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		int c=Integer.parseInt(num[2]);
		int div=0;
		
		for(int i=a;i<=b;i++){
			if(c%i==0){
				div++;
			}
		}
		System.out.println(div);
	}
}