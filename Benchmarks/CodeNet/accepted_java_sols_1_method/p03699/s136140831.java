import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        int flag = 0;
        int wa = 0;
        for(int i = 0; i < n; i++){
            if(s[i] % 10 != 0){
                wa = s[i];
                flag = 1;
                break;
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + s[i];
        }
        if(flag == 0){
            System.out.print(0);
        } else if(flag == 1 && sum % 10 == 0){
            System.out.print(sum - wa);
        } else {
            System.out.print(sum);
        }
    }
}