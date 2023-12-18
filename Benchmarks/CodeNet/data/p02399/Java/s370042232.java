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
	float f =  a_f / b_f ;
		if (f > 1000000){
		int x = a / b;
		float r_f = (float)r ;
		float y = r_f / b_f;
		float z = x + y;
		
			if(r_f == 0){System.out.println(d +" "+ r + " " + x);}
			else{ if(y == 0.5 ){System.out.println(d +" "+ r + " " + x + ".5");} else{ System.out.println(d + " " + r + " "+ z);}}}
			else{
			System.out.println(d + " " + r + " " + f);
		}
	}
}
