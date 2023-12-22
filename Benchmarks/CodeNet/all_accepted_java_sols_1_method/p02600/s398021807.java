import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		if(a>=400&&a<=599) {
			System.out.println(8);
		}else if(a>=600&&a<=799) {
			System.out.println(7);
		}else if(a>=800&&a<=999) {
			System.out.println(6);
		}else if(a>=1000&&a<=1199) {
			System.out.println(5);
		}else if(a>=1200&&a<=1399) {
			System.out.println(4);
		}else if(a>=1400&&a<=1599) {
			System.out.println(3);
		}else if(a>=1600&&a<=1799) {
			System.out.println(2);
		}else if(a>=1800&&a<=1999) {
			System.out.println(1);
		}


	}

}

