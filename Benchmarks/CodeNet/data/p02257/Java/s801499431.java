import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        int[] nums = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(br.readLine());
            int j = 2;
            int x = 0;
            while(j < nums[i]){
                if(nums[i] == 2){
                    break;
                }
                if(nums[i] % j == 0){
                    x++;
                }
                j++;
            }
            if(x == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}