import java.io.IOException;
import java.util.Scanner;

//????????????????????????hms???????????????
public class Main{

	public static void main(String[] args) throws IOException{

		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		hms(x);
		in.close();

	}

	public static void hms(int num){
		int h=num/3600;
		int m=(num%3600)/60;
		int s=(num%3600)%60;
		System.out.println(h +":"+m+":"+s+"");

	}

}