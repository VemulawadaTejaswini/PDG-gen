import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cnt = new int[4];
        
        for(int i=0; i<N; i++){
            String str = sc.next();
            if(str.equals("AC")){
                cnt[0]++;
            }else if(str.equals("WA")){
                cnt[1]++;
            }else if(str.equals("TLE")){
                cnt[2]++;
            }else if(str.equals("RE")){
                cnt[3]++;
            }
        }
        System.out.println("AC x "+cnt[0]);
        System.out.println("WA x "+cnt[1]);
        System.out.println("TLE x "+cnt[2]);
        System.out.println("RE x "+cnt[3]);
    }
}