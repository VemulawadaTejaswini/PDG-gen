import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(;;){
			int x = s.nextInt();
			int h = s.nextInt();
			if(x==0)
				break;
			System.out.println(x*x+x*Math.sqrt(4*h*h+x*x));
		}
    }
}