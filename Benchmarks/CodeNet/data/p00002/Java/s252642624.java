import java.io.*;

class Main{
	public static void main(String[] args){
		int a,b,sum,digits;
		String str;
		String num[]=new String[2];
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		while(str=in.readLine()!=\0){
			digits=1;
			num=str.split(" ",0);
			a=Integer.parseInt(num[1]);
			b=Integer.parseInt(num[2]);
			sum=a+b;
			while(sum/10!=0){
				digits++;
			}
			System.out.println(digits);
		}
	}

}