import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            if(map.get(a) != null){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a,1);
            }
            if(map.get(b) != null){
                map.put(b, map.get(b)+1);
            }else{
                map.put(b,1);
            }
        }
        for(int i = 1;i<n+1;i++){
            if(map.get(i) != null){
                System.out.println(map.get(i));
            }else{
                System.out.println(0);
            }
        }
    }
}