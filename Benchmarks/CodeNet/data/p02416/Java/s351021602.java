import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int ans = 0;
        int num;
        int length;
        String strNum;
        
        while(sc.hasNextLine()){
            strNum = sc.next();            
            if("0".equals(strNum)){
              break;
            }
          
            length = strNum.length();
            String[] strArray = strNum.split("");
    
            for(int i = 0;i<length; i++){
                num = Integer.parseInt(strArray[i]);
                ans += num;
                
            }System.out.println(ans);
             ans = 0;
        }
    }
}

