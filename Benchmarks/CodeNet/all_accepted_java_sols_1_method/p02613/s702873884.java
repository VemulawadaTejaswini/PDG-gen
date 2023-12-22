import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = Integer.parseInt(sc.nextLine());
        
        String  str[] = new String[n];
        
        
        for(int i = 0; i < n ; i++){
             str[i] = sc.next();
        }

        //for(int i = 0; i < n ; i++){
        //    System.out.println(str[i]);
       //}
        
        int cnt_AC = 0;
        int cnt_WA = 0;
        int cnt_TLE = 0;
        int cnt_RE = 0;

        
        for(int i = 0; i < n ; i++){
            if( str[i] .equals( "AC")){
                //System.out.println("AC ");
                 cnt_AC ++;
            }else if( str[i] .equals("WA")){
                cnt_WA ++;
                
            }else if( str[i].equals( "TLE")){
                cnt_TLE++;
            }else if( str[i].equals("RE")){
                cnt_RE++;
            }
       }
        System.out.println("AC x "+cnt_AC);  
        //System.out.println(cnt_AC);  
        System.out.println("WA x "+cnt_WA);  
        System.out.println("TLE x "+cnt_TLE);  
        System.out.println("RE x "+cnt_RE);  
}

}