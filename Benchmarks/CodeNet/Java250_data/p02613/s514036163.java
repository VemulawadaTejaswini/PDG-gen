import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count_ac=0;
        int count_wa=0;
        int count_tle=0;
        int count_re=0;
        
        
        for(int i=0;i<n;i++){
            String str = sc.next();
            if(str.equals("AC")){
                count_ac++;
                continue;
            }
            if(str.equals("WA")){
                count_wa++;
                continue;
            }
            if(str.equals("TLE")){
                count_tle++;
                continue;
            }
            if(str.equals("RE")){
                count_re++;
                continue;
            }
            
        }
        System.out.println("AC x " + count_ac);
        System.out.println("WA x " + count_wa);
        System.out.println("TLE x " + count_tle);
        System.out.println("RE x " + count_re);

    }
}
