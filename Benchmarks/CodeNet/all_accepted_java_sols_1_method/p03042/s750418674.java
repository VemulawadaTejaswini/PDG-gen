import java.util.*;
import java.text.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       String a = sc.next();
        DateFormat df1 = new SimpleDateFormat("MMyy");
        DateFormat df2 = new SimpleDateFormat("yyMM");
        df1.setLenient(false);
        df2.setLenient(false);
        String s="";
        try{
            df1.parse(a);
            s="MMYY";
            df2.parse(a);
            s="AMBIGUOUS";
        } catch (ParseException e) {
            try{
                df2.parse(a);
                s="YYMM";
            }catch (Exception f){

            }
        }
        if(s.equals("")){
            s="NA";
        }
        System.out.println(s);

    }
}
