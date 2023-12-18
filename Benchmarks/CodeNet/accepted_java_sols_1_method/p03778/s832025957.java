import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int out = 0;
        if(a <= b){
            if(b > a + w){
                out = b - a - w;
            }
        }else if(a > b + w){
            out = a - b - w;
        }
        System.out.println(out);
    }
}