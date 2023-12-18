import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int AC=0,WA=0,TLE=0,RE=0;
        String str = null;
        for(int i=0;i<N;i++){
             str = scanner.next();
             if(str.equals("AC")){
                 AC++;
             }else if(str.equals("WA")){
                 WA++;
             }else if(str.equals("TLE")){
                 TLE++;
             }else{
                 RE++;
             }
        }
        System.out.println("AC x "+AC);
        System.out.println("WA x "+WA);
        System.out.println("TLE x "+TLE);
        System.out.println("RE x "+RE);
    }
}
