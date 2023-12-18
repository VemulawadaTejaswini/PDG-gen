import java.util.*;
import java.io.*;


public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        float d = scanner.nextInt();
        float t = scanner.nextInt();
        float s = scanner.nextInt();
        
        if(d/s>t)
        System.out.println("NO");
        else
        System.out.println("YES");
        
        
     }
}
