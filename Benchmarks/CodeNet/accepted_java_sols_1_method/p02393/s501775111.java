import java.lang.Math;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int x;
        int y;
        int z;

        if(a <= b && a <= c){
            x = a;
            if(b < c){
                y = b;
                z = c;
            }
            else{
                y = c;
                z = b;
            }
        }
        else if(b <= a && b <= c){
            x = b;
            if(a < c){
                y = a;
                z = c;
            }
            else{
                y = c;
                z = a;
            }
        }
        else{
            x = c;
            if(a < b){
                y = a;
                z = b;
            }
            else{
                y = b;
                z = a;
            }
        }

        System.out.println(x + " " + y + " " + z);

        scanner.close();
    }
}
