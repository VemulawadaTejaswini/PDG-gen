import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a, b, C;
	double S, L, h;
	a = sc.nextInt();
	b = sc.nextInt();
	C = sc.nextInt();
	S = a*b*Math.sin(Math.toRadians(C))/2;
	L = a+b+(Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(C))));
	h = 2*S/a;
	System.out.println(S);
	System.out.println(L);
	System.out.println(h);
    }
}