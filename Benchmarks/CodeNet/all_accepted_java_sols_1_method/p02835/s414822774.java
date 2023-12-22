import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        int A1, A2, sum, A3;
        Scanner scan = new Scanner(System.in);
        A1 = scan.nextInt();
		A2 = scan.nextInt();
      	A3 = scan.nextInt();
        sum = A1+A2+A3;
      	if(sum>=22){
          System.out.print("bust");
        }else{
          System.out.print("win");
        }

        
    }
}