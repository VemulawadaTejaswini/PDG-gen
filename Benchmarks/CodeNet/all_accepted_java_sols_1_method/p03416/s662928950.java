import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = 0;
        for(int i=a;i<b+1;i++){
            String str = String.valueOf(i);
            if(str.charAt(0) == str.charAt(4)
        && str.charAt(1) == str.charAt(3)){
                p += 1;
            }
        }
        System.out.println(p);
    }
}