import java.util.Scanner;

 public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();     
        int x = sc.nextInt();   
        int res ;

        for (int count = 0; count < 10; count++) {
        	
            res = r*x-D;   
            x = res;
            System.out.println(res);
        }

    }
}