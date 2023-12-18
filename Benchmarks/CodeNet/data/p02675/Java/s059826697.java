import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if(a % 10 == 2 || a % 10 == 4 || a % 10 == 5 || a % 10 == 7 || a % 10 == 9) {
        	System.out.println("hon");
        } else if (a % 10 == 0 || a % 10 == 1 || a % 10 == 6 || a % 10 == 8){
        	System.out.println("pon");
        } else {
        	System.out.println("bon");
        }



        scan.close();
    }


}