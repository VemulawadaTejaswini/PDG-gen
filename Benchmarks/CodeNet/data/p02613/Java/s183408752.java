import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int AC,WA,TLE,RE=0;
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
        System.out.println("WE x "+WE);
        System.out.println("TLE x "+TLE);
        System.out.println("RE x "+RE);
    }
}
