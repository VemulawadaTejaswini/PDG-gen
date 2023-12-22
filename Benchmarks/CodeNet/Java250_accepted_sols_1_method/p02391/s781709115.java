import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>b){
			System.out.println("a > b");
		}else if(a<b){
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}
	}

}