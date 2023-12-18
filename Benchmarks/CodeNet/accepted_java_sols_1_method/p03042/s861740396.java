import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String fa = s.substring(0, 2);
        String ea = s.substring(2);
        int f = Integer.parseInt(fa);
        int e = Integer.parseInt(ea);
        if(e == 0){
            if(f == 0 || f > 12){
                System.out.println("NA");
                return;
            }
            System.out.println("MMYY");
            return;
        }
        if(f == 0){
            if(e == 0 || e > 12){
                System.out.println("NA");
                return;
            }
            System.out.println("YYMM");
            return;
        }
        if(e <= 12){
            if(f <= 12){
                System.out.println("AMBIGUOUS");
                return;
            }else{
                System.out.println("YYMM");
                return;
            }
        }else{
            if(f <= 12){
                System.out.println("MMYY");
                return;
            }else{
                System.out.println("NA");
                return;
            }
        }
    }
}
