import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		double men = (double)r * r;
		double ensyu = (double)r * 2;

		System.out.println(((double)men * 3.1459)+ " " + ((double)ensyu * 3.1459));
        scan.close();
    }

}