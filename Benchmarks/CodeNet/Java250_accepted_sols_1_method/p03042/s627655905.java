import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        int first2 = Integer.parseInt(S.substring(0,2));
        int last2 = Integer.parseInt(S.substring(2,4));
        String result = "";
        if(1<=first2 && first2<=12){
            if(1<=last2 && last2<=12){
                result = "AMBIGUOUS";
            }else{
                result = "MMYY";
            }
        }else{
            if(1<=last2 && last2<=12){
                result = "YYMM";
            }else{
                result = "NA";
            }
        }

        System.out.println(result);
    }
}