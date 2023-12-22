import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String f = S.substring(0, 2);
        String b = S.substring(2);
        int fm = Integer.parseInt(f);
        int bm = Integer.parseInt(b);

        if(fm>12 && bm>12){
            System.out.println("NA");
        }
        else if((fm>12 && bm==0) || (fm==0 && bm>12) || (fm==0 & bm==0)){
            System.out.println("NA");
        }
        else if(fm<=12 && fm>0 && bm<=12 && bm>0){
            System.out.println("AMBIGUOUS");
        }
        else if((fm>12 || fm==0) && bm<=12 && bm>0){
            System.out.println("YYMM");
        }
        else if((bm>12 || bm==0) && fm<=12 && fm>0){
            System.out.println("MMYY");
        }
    }
}