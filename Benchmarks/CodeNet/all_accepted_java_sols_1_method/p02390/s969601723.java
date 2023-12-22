import java.util.Scanner;

class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int sec = a%60;
	        int m = a/60;
	        int min = m%60;
	        int hour = m/60;

	        System.out.println(hour+":"+min+":"+sec);
	    }
	}
