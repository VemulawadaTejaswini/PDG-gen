import java.util.Scanner;
import java.lang.Math;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int k = stdIn.nextInt();

        for(int i=0; i<k+2-1; i++){
            for(int j=i+1; j<k+2; j++){
                if(a * Math.pow(2, i) < b * Math.pow(2, j-i-1) && b * Math.pow(2, j-i-1) < c * Math.pow(c, k+1-j)){
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}
