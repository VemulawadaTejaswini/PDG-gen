import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // 定数
        final String RESULT_YES = "Yes";
        final String RESULT_NO = "No";
        
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner("1 1\r\n999-0000");
        
        // ハイフンより前の文字数
        int postOfficeCode = sc.nextInt();
        // ハイフンより後の文字数
        int locationCode = sc.nextInt();
        // 評価対象文字列
        String val = sc.next();
        
        boolean result = false;
        
        if(val.matches("[0-9]{"+postOfficeCode+"}-[0-9]{"+locationCode+"}")) {
            result = true;
        }
        
        if(result) {
            System.out.println(RESULT_YES);
        } else {
            System.out.println(RESULT_NO);
        }
        
    }
}
