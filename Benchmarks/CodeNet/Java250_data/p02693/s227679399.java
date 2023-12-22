import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		String s = "NG";
		for(int i = a; i <= b; i++){
			if(i % k == 0){
				s = "OK";
				break;
			}
		}
		System.out.println(s);
	}
}
