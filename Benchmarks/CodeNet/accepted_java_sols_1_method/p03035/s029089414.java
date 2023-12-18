import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a <= 5){
			System.out.println(0);
		}
		else if(a >= 13){
			System.out.println(b);
		}
		else{
			System.out.println(b / 2);
		}
	}
}
