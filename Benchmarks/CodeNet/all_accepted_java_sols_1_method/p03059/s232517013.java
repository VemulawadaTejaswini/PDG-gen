import java.util.*;
class Main{
	public static void main(String arts[]){
      	Scanner sc =  new Scanner(System.in);
      	int A;
      	int B;
      	double T;
      	int c = 0;
      	A = sc.nextInt();
      	B = sc.nextInt();
      	T = sc.nextInt();
      	T = T + 0.5;
      	c = (B * (int)(T / A));
       System.out.println(c);
    }
}