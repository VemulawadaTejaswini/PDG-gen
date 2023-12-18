import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] $) throws IOException{
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if(N%10 == 2 || 
        N%10 == 4 ||
        N%10 == 5 ||
        N%10 == 7 ||
        N%10 == 9){
            System.out.println("hon");
        }else if(N%10 == 3){
            System.out.println("bon");
        }else{
            System.out.println("pon");
        }
           

    }
}