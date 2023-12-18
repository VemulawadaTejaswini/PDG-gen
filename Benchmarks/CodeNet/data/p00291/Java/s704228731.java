import java.util.Scanner;

public class Main{
	
	void main() {
		 Scanner sc = new Scanner(System.in);
	     int[] a = new int[6];
	     for(int i=0;i<6;i++) {
	    	 a[i] = sc.nextInt();
	     }
	     if(a[0] + 5*a[1] + 10*a[2] + 50*a[3] + 100*a[4] + 500*a[5] >= 1000) {
	    	 System.out.println(1);
	     }else {
	    	 System.out.println(0);
	     }
    }

    public static void main(String[] args) {
        new Main().main();
    }



}
