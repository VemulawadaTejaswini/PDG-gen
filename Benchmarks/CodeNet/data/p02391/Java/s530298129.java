import java.io.*;

class Main{
	public static void main(String[] args)throws java.io.IOException{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if(a>b){
			System.out.println(a + ">" + b);
		}else if(a<b){
			System.out.println(a + "<" + b);
		}else if(a == b){
			System.out.println(a + "==" + b);
		}
  	}
}