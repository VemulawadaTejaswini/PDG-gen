import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int h = scan.nextInt();
        int a = scan.nextInt();
        int out;
        if(h % a == 0){
            out = h / a;
            System.out.println(out);
        }else{
            out = h / a + 1;
            System.out.println(out);
        }
    }
}