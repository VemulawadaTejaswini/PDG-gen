
import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Long> a = new ArrayList<>();
        HashMap<Long,Long> energy = new HashMap<>();
        for(int i=0;i<n;i++){
            long tempA = sc.nextInt();
            long tempB = sc.nextInt();
            if(energy.containsKey(tempA)){
                energy.put(tempA,energy.get(tempA)+tempB);
            }else{
                energy.put(tempA,tempB);
                a.add(tempA);
            }
        }

        Collections.sort(a);

        long ans = 0;
        for(Long value:a){
            long count = energy.get(value);
            //System.out.println(value+" "+count);
            for(long i=0;i<count;i++){
                m--;
                ans+=value;
                if(m==0){
                    System.out.println(ans);
                    return;
                }
            }
        }

    }
}
