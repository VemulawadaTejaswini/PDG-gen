import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        while(true){
            String str = in.next();
            if(str.equals("-"))break;

            int n = in.nextInt();
            for(int i = 0; i < n ; i++){
                int cutIndex = in.nextInt();
                String sub1 = str.substring(0, cutIndex), sub2 = str.substring(cutIndex);
                str = sub2 + sub1;
            }

            System.out.println(str);
        }
    }
}
