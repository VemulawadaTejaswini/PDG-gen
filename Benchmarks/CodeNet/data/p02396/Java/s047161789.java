import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long testdate;
		int i = 1;
		while((testdate = sc.nextInt()) != 0){
	        System.out.println("case " + i++ + ": " + testdate);
		}
        System.out.println();
        sc.close();
    }

}