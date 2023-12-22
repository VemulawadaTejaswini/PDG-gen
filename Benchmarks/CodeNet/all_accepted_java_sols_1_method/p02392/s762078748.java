import java.io.*;

public class Main{
public static void main(String[] args){
	try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] str = br.readLine().split(" ");
	int num0 = Integer.parseInt(str[0]);
	int num1 = Integer.parseInt(str[1]);
	int num2 = Integer.parseInt(str[2]);

		if ( num0 < num1 && num1 < num2){
		System.out.println("Yes");
		}else{
		System.out.println("No");
		}
	}catch(IOException e){
	System.out.println(e);
	}
}
}	