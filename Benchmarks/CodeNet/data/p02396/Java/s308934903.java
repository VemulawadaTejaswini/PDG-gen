import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int date, cnt = 1;
		while(scan.hasNext()){
			date = scan.nextInt();
			System.out.println("Case " + cnt++ + ": " + date);
		}
        scan.close();
    }
}