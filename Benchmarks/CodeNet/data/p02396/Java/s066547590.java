package aoj4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        
        int i = 1;
        while(sc.hasNext()) {
            int value = sc.nextInt();
            if (value == 0) break;
            
            if (i > 1) builder.append("\n");
            builder.append("Case ").append(i).append(": ").append(value);
            i++;
        }
        System.out.print(builder.toString());
    }
}