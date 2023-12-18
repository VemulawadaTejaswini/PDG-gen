import java.util.Scanner;

public class main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		while(x != 0 && y != 0){
			if(x < y)
	         System.out.println(x + " " + y);
			else
				System.out.println(y + " " + x);
			x = scan.nextInt();
			y = scan.nextInt();
		}
        scan.close();
    }

}