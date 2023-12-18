import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        long output = (long)a*c;
        output = Math.max(output, (long)a*d);
        output = Math.max(output, (long)b*c);
        output = Math.max(output, (long)b*d);
        
        System.out.println(output);
        
    }
}
