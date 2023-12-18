import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int intOfQuo = a / b;
		int residual = a % b;
		float quotient = (float)a / (float)b;
		System.out.println(intOfQuo + " " + residual + " " + quotient);
	}
}