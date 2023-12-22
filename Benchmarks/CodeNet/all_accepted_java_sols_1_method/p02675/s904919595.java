import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        //int M = scan.nextInt();
        ArrayList al1 = new ArrayList(Arrays.asList(0,1,6,8));
        int num = N%10;
         if(num==3){
             System.out.println("bon");
         }else if(al1.contains(num)) {
             System.out.println("pon");
         }
         else{
             System.out.println("hon");
         }
    }
}