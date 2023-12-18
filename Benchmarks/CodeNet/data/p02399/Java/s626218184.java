import java.util.*;
public class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int d = a / b;
	int r = a % b;
	float a_f = (float)a;
	float b_f = (float)b;
	float f = 1.0 * a_f / b_f ;
	System.out.println(d + " " + r + " " + f);
	}
}
