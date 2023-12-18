import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int testdate, cnt = 1;
		while(scan.hasNext()){
			testdate = scan.nextInt();
	        System.out.println("case " + cnt++ + ": " + testdate);
		}
        scan.close();
    }

}