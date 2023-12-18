import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        int a=Integer.parseInt(str.substring(0,2));
        int b=Integer.parseInt(str.substring(2));
        boolean am=false,bm=false;
        if(1<=a&&a<=12)am=true;
        if(1<=b&&b<=12)bm=true;
        if(am&&bm){
            System.out.println("AMBIGUOUS");
        }else if(am==false&&bm==false){
            System.out.println("NA");
        }else if(am==false){
            System.out.println("YYMM");
        }else{
            System.out.println("MMYY");
        }
    }
}
