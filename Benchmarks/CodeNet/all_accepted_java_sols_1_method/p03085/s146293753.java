import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        if (b.compareTo("A") == 0){
            System.out.println("T");
        }else if(b.compareTo("C") == 0){
            System.out.println("G");
        }else if(b.compareTo("G") == 0){
        System.out.println("C");
        }else if(b.compareTo("T") == 0){
            System.out.println("A");
        }
        sc.close();
    }
}