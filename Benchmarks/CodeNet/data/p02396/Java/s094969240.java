import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testdate, i = 1;
		testdate = sc.nextInt(); 
		while(testdate != 0){
	        System.out.println("case " + i + ": " + testdate);
			testdate = sc.nextInt(); 
		}
        System.out.println();
        sc.close();
    }

}