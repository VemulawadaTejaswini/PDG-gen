import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w=sc.nextDouble(),h=sc.nextDouble(),x=sc.nextDouble(),y=sc.nextDouble();
		double sum=w*h;
		if(w/2==x&&h/2==y) {
			System.out.println(sum/2+" "+1);
		}else{
			System.out.println(sum/2+" "+0);
		}
	}
}

