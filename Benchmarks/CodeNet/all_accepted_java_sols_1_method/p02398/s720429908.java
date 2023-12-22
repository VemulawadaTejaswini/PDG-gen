import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int n = 0;
		int kazu = 0;
		for(int i= a;i<=b;i++){
			if (c%i == 0){
				kazu += 1;
			}
		}
		System.out.println(kazu);
	}
}