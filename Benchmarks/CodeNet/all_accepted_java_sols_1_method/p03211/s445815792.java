import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        String s =sc.next();
        String A;
        int num[] = new int[3];
        int ans = 0;
        int answer = 0;
        int result = 1000;
        
        String slist[] = s.split("");
        
        for(int i = 2; i < slist.length; i++){
            A = slist[i-2] + slist[i-1] + slist[i];
            ans = Integer.parseInt(A);
            answer = Math.abs(753-ans);
            if(answer < result){
                result = answer;
            }
        }
        System.out.println(result);
    }
}