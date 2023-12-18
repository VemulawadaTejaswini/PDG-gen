import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		short testdate;
		int i = 1;
		while((testdate = scan.nextShort()) != 0){
	        System.out.println("case " + i++ + ": " + testdate);
		}
        scan.close();
    }

}