import java.util.*;

public class Main{
    public static void main(String[] args){
        java.util.Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++) list.add(sc.nextInt());
        Collections.sort(list);
        boolean[] dp = new boolean[list.get(n-1)+1];
        for(int i=0;i<list.get(n-1)+1;i++) dp[i]=true;
        for(int i=0;i<n;i++){
            int temp=2;
            while(list.get(i)*temp<=list.get(n-1)){
                dp[list.get(i)*temp]=false;
                temp++;
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(dp[list.get(i)]==true){
                if(i==0){
                    if(list.get(1)!=list.get(0)){
                        ans++;
                    }
                }else if(i==n-1){
                    if(list.get(n-1)!=list.get(n-2)){
                        ans++;
                    }
                }else{
                    if(list.get(i)!=list.get(i-1) && list.get(i)!=list.get(i+1)){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}