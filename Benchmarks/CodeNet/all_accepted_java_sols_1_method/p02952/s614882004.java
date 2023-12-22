
import java.util.*;

import javax.print.attribute.standard.DialogTypeSelection;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(((int)(Math.log10(i)) + 1) % 2 == 1) count++;
        }
        System.out.println(count);
    }
}