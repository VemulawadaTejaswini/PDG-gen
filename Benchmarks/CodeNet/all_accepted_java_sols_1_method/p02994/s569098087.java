import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        int[] taste = new int[n];
        int sum = 0;
        int minAbs = 10000;
        int eat = 0;
        for(int i = 0; i < n; i++){
            taste[i] = l + i;
            sum += taste[i];
            if(minAbs > Math.abs(taste[i])){
                minAbs = Math.abs(taste[i]);
                eat = taste[i];
            }
        }
        Arrays.sort(taste);
        System.out.println(sum - eat);
        scan.close();
    }
}
