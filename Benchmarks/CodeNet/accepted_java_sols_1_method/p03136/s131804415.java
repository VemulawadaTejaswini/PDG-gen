import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + l[i];
        }
        if((sum - l[n-1]) > l[n-1]){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}