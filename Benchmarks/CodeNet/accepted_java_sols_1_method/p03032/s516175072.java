import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] d = new int[n];
        for(int i=0; i<n; i++) {
            d[i] = in.nextInt();
        }

        int max = 0;
        for(int dropCount=0; dropCount<n; dropCount++) {
            for(int fromLeftCount=0; fromLeftCount<=k-dropCount; fromLeftCount++) {
                int fromRightCount = Math.max(k-dropCount-fromLeftCount, 0);
                ArrayList<Integer> gems = new ArrayList<>();
                for(int i=0; i<fromLeftCount&&i<n; i++) {
                    gems.add(d[i]);
                }
                for(int i=n-1; i>=n-fromRightCount&&i>=fromLeftCount; i--) {
                    gems.add(d[i]);
                }
                Collections.sort(gems);
                for(int i=0; i<dropCount&&i<gems.size(); i++) {
                    if(gems.get(i)<0) {
                        gems.set(i, 0);
                    }
                }
                int sum = 0;
                Iterator<Integer> it = gems.iterator();
                while(it.hasNext()) {
                    sum += it.next();
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
