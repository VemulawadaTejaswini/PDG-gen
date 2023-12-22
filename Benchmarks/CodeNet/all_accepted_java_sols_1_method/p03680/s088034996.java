import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] al = new int[n];
        for(int i = 0; i < n; i++){
            al[i] = sc.nextInt()-1;
        }
        int ans = 0;
        int ind = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        while(true){
            if(hs.contains(ind)){
                System.out.println(-1);
                break;
            }else if(ind == 1){
                System.out.println(ans);
                break;
            }else{
                ans++;
                hs.add(ind);
                ind = al[ind];
            }
        }
    }
}