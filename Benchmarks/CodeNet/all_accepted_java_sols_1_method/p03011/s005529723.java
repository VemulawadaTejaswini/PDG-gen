import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int kyori[] = new int[3];
        kyori[0] = stdIn.nextInt();
        kyori[1] = stdIn.nextInt();
        kyori[2] = stdIn.nextInt();
        
        Arrays.sort(kyori);
        
        System.out.println(kyori[0] + kyori[1]);
    }
}
