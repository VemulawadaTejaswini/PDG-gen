import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        ArrayList<Integer> divs = new ArrayList<>();
        int count = 0;
       for(int i = a; i <= b; i++) {
           if(c % i == 0) {
               if( i >= a && i <= b){
                   count++;
               }
           }
        }
        System.out.println(count);
    }
}
