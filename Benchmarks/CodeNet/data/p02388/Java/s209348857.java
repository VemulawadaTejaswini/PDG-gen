import java.io.*;
class Main{
	public static void main (String[] args)throws IOException{
		int x, sum=0, i;
		
		BufferedReader d =new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(d.readLine());
		sum =x;
		
		for(i=1; i<3; i++){
			sum *= x;
		}
		System.out.println(sum);
	}
}