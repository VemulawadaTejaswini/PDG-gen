import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    
	    int cal1 = A + B;
	    int cal2 = A - B;
	    int cal3 = A * B;
	    
	    int max = 0;
	    
	    if (cal1 >= Math.max(cal2, cal3)) {
	    	max = cal1;
	    } else if (cal2 >= Math.max(cal3, cal1)) {
	    	max = cal2;
	    } else {
	    	max = cal3;
	    }
	    System.out.println(max);
	}	
}	