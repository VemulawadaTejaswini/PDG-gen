
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int h = 0;
		int m = 0;
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();   //60s 60m=3600s
		if(s>3600){
			h = s/3600;
			s %= 3600;
		}
        if(s>60){
        	m = s/60;
        	s %= 60;
        }
        System.out.printf("%d;%d;%d\n",h,m,s);

	}

}