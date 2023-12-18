package aoj4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        
        int i = 1;
        boolean hasNext = true;
        while(hasNext) {
            int value = sc.nextInt();
            
            if (value == 0) break;
            
            builder.append("Case ").append(i).append(": ").append(value);
            
            hasNext = sc.hasNext();
            if (hasNext) builder.append("\n");
            
            i++;
        }
        
        System.out.print(builder.toString());
    }
}