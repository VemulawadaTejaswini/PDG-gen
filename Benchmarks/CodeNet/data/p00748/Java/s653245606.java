import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
   //     Scanner sc = new Scanner(System.in);
        int[] list1 = new int[180];
        int[] cnt1 = new int[1000001];
        int[] cnt2 = new int[1000001]; 
        for(int i = 0; i < 180; i++) {
            list1[i] = (i+1)*(i+2)*(i+3)/6;
        }
        // Here your code !
        for(int i = 0; i <= 1000000; i++){
            cnt1[i] = i;
            cnt2[i] = i;
        }
        
        for(int n = 3, p = 4; p <= 1000000; n++){
            for(int i = 0; i+p <= 1000000; i++){
                cnt1[i+p] = Math.min(cnt1[i+p], cnt1[i] + 1);
            }
            if(p % 2 == 1){
                for(int i = 0; i+p <= 1000000; i++){
                    cnt2[i+p] = Math.min(cnt2[i+p], cnt2[i] + 1);
                }
            }
            // p?????????????????§??´??°
            p = n * (n+1) * (n+2) / 6;
        }
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) break;
            System.out.println(cnt1[num] + " " + cnt2[num]);
        }
    }
}