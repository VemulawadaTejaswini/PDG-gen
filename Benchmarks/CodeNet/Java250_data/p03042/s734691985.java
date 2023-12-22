import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        String s = scan.next();
        int a = 0;
        int b = 0;
        int c = 4;
        a = Character.getNumericValue(s.charAt(0)) * 10 + Character.getNumericValue(s.charAt(1));
        b = Character.getNumericValue(s.charAt(2)) * 10 + Character.getNumericValue(s.charAt(3));
        if(1 <= a && a <= 12){
            if(1 <= b && b <= 12){
                c = 3;
            }else{
                c = 2;
            }
        }else if(1 <= b && b <= 12){
            if(1 <= a && a <= 12){
                c = 3;
            }else{
                c = 1;
            }
        }
        if(c == 1){
            System.out.println("YYMM");
        }else if(c == 2){
            System.out.println("MMYY");
        }else if(c == 3){
            System.out.println("AMBIGUOUS");
        }else{
            System.out.println("NA");
        }
    }
}