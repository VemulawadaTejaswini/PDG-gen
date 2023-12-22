import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = Integer.parseInt(s.substring(0,2));
        int b = Integer.parseInt(s.substring(2,4));


            if(b>0 && b<13 && a>0 && a<13){
                System.out.println("AMBIGUOUS");
            }else if(b>0 && b<13){
                System.out.println("YYMM");
            }else if(a>0 && a<13){
                System.out.println("MMYY");
            }else{
                System.out.println("NA");
            }

        

    }
}
