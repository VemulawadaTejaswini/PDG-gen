import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int today = 0;
        
        for(int i=0; i<days.length; i++){
            if(days[i].equals(s)){
                today = i;
                break;
            }
        }
        
        int ans = 0;
        for(int j=today; j<days.length; j++){
            if(days[j].equals("SUN")){
                break;
            }
            ans++;
        }
        
        System.out.println(ans==0?7:ans);
    }
}