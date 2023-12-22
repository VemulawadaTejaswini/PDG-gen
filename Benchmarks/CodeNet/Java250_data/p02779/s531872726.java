import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Boolean> map = new HashMap<>();
        String ans = "YES";
        for(int i = 0;i<n;i++){
            int num = sc.nextInt();
            if(map.get(num) == null){
                map.put(num, true);
            }else{
                ans = "NO";
                break;
            }
        }
        System.out.println(ans);
    }
}