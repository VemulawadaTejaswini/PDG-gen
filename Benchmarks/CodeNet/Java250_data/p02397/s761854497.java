import java.util.Scanner;                                                   
import java.util.Arrays;
   
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            int x = scan.nextInt(), y = scan.nextInt();
            int[] data = {x, y};
            Arrays.sort(data);     
            if(x == 0 && y == 0) break;
            else {
                System.out.println(data[0] + " " + data[1]);
            } 
        } 
    } 
}