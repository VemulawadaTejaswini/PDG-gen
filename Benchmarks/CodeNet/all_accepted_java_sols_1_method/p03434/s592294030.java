import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] card = new int[n];
        int[] alice = new int[n];
        int[] bob = new int[n];
        for(int i = 0; i < n; i++){
            card[i] = sc.nextInt();
        }
        Arrays.sort(card);
        if(card.length % 2 == 0){
            for(int i = 0; i < n; i++){
                if(i % 2 == 1){
                    alice[i] = card[i];
                }else{
                    bob[i] = card[i];
                }
            }
        }else{
            for(int i = 0; i < n; i++){
                if(i % 2 == 1){
                    bob[i] = card[i];
                }else{
                    alice[i] = card[i];
                }
            }
        }
        int cnt_a = 0;
        int cnt_b = 0;
        for(int a : alice){
            cnt_a += a;
        }
        for(int b : bob){
            cnt_b += b;
        }
        System.out.println(cnt_a - cnt_b);
    }
}
