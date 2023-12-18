import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] div = new int[arr[0] + 1];
        for(int i = 0; i < n; i++){
            helper(arr[i],div);
        }
        boolean pair = true, set = true;
        for(int i = 2; i < div.length; i++){
            if(div[i] > 1)
                pair = false;
            if(div[i] == n)
                set = false;
        }
        if(pair)
            System.out.println("pairwise coprime");
        else if(set)
            System.out.println("setwise coprime");
        else
            System.out.println("not coprime");
    }
    public static void helper(int num, int[] div){
        for(int i = 2; i <= Math.min((int)Math.sqrt(num), div.length - 1); i++){
            if(num % i == 0){
                div[i]++;
                if(i * i < num && num / i < div.length)
                    div[num / i]++;
            }
        }
    }
}