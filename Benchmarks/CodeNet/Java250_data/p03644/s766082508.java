import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
      	int n = 0;

        while (Math.pow(2,n + 1) <= N ) {
          n = n + 1;
          
        } 
          System.out.println(Math.round(Math.pow(2,n)));
           
    }
}

