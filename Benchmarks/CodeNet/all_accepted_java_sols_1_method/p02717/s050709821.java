import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
      	int a=x;
      int b=y;
      int c=z;
      int aux=a,aux1=c;
      a=b;
      b=aux;
      c=a;
      a=aux1;
		System.out.println((a+" "+b+" "+c));
	}
}
