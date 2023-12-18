import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Double x1=sc.nextDouble(),y1=sc.nextDouble(),x2=sc.nextDouble(),y2=sc.nextDouble();
		Double q;
		q=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(q);
	}
}

