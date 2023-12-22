import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int hikaku = Integer.MAX_VALUE;
        List<Integer> point = new ArrayList<>();
        for(int i = 0;i < n;i++){
            point.add(sc.nextInt());
        }
        Collections.sort(point);

        for(int i = 1;i <= point.get(n-1);i++){
            int sum = 0;
            for(int j = 0;j < n;j++){
                sum += Math.pow(point.get(j)-i,2);
            }
            ans = Math.min(sum,hikaku);
            if(sum < hikaku)
                hikaku = sum;
        }

        System.out.println(ans);
    }
}