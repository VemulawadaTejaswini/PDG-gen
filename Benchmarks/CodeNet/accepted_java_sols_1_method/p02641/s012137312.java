import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int i = 0; i < n; i++){
            map.put(sc.nextInt(), 1);
            //map.put(i + 1, 1);
        }

        for(int i = 0; i < 102; i++){
            if(!map.containsKey(i)){
                if(min >  Math.abs(x - i)){
                    min = Math.abs(x - i);
                    ans = i;
                }
            }
        }

        System.out.println(ans);

    }
}
