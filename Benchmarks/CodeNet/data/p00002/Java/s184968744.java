import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner inp = new Scanner (System.in);
        while(inp.hasNext()){
            int num_1 = inp.nextInt();
            int num_2 = inp.nextInt();
            int sum = num_1+num_2;
            int digit = (int)(Math.log10(sum)+1);;
            System.out.println(digit);
        }
    }
}