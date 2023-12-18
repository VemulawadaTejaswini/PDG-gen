import java.io.*;

public class Main{
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a, b;
		try{
			String str = br.readLine();
			String[] strAry = str.split(" ");
			a = Integer.parseInt(strAry[0]);
			b = Integer.parseInt(strAry[1]);
		}catch(Exception e){
			a = 0;
			b = 0;
		}

		if (a < b){
			System.out.println("a < b");
		}else if(a > b){
			System.out.println("a > b");
		}else{
			System.out.println("a == b");
		}
	}
}