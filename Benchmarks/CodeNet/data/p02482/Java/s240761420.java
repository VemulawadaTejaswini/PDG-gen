import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double x,y;
		x=sc.nextDouble();
		y=sc.nextDouble();
		if(x>y)System.out.println("a>b");
		if(x==y)System.out.println("a=b");
		if(x<y)System.out.println("a<b");
		sc.close();
	}

}