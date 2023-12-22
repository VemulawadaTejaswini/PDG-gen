import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        
    
        String x="";
        //ac
            //wa
            //tle
            //re
        int ac=0;
        int wa=0;
        int tle=0;
        int re=0;
        
        
        for(int i=0;i<=a;i++){
            x=sc.nextLine();
            if(x.equals("AC")){
                ++ac;
            }else if (x.equals("WA")){
                ++wa;
            }else if (x.equals("TLE")){
                ++tle;
            }else if (x.equals("RE")){
                ++re;
            }
            
            
            //ac
            //wa
            //tle
            //re
        }
        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+re);
        
    }
}
