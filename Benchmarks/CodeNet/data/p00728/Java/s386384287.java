import java.util.Scanner;
 
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
 
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
 
            int[] s = new int[n];
 
            for(int i = 0; i < n; i++){
                s[i] = sc.nextInt();
            }
 
            int min = s[0];
            int max = s[0];
 
            for(int j = 1; j < n; j++){
                min = Math.min(min, s[j]);
                max = Math.max(max, s[j]);
            }
 
            int sum = 0;
 
            for(int k = 0; k < n; k++){
                sum += s[k];
            }
 
            int ave = (sum - min - max) / (n - 2);
 
            System.out.println(ave);
 
        }
 
    }
}
