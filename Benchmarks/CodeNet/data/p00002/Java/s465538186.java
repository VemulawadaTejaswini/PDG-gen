import java.io.*;

class vol00002{
	public static void Main(String[] args)throws IOException{	//提出する時はMainに変更する
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		int a;
		int b;
		int digit;
		int count = 0;
		
		while(true){
			count = 1;
			a=-1;
			b=-1;
			a = Integer.parseInt(r.readLine());
			b = Integer.parseInt(r.readLine());
			
			if(a==-1&&b==-1)break;
			
			digit=a+b;
			
			while(true){
				digit/=10;
				if(digit < 1)break;
				++count;
			}
			System.out.println(count);
		}
	}
}