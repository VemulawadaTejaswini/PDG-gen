import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n >= 4){
			if(n % 4 == 0 || n % 7 == 0){
				System.out.println("Yes");
				return;
			}
			else if(n > 4){
				n = n - 4;
			}
			else if(n > 7){
				n = n - 7;
			}
		}
		System.out.println("No");
	}
}
