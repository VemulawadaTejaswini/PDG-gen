import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        sc.nextLine();
        int sum = 0;
        for(int i = 0;i<n;i++){
            t[i] = sc.nextInt();
            sum += t[i];
        }
        sc.nextLine();
        int m = sc.nextInt();
        int tmp = 0;
        int[] answer = new int[m];
        for(int i = 0;i<m;i++){
            tmp = sum;
            tmp -= t[sc.nextInt()-1];
            tmp += sc.nextInt();
            sc.nextLine();
            answer[i] = tmp;
        }
        for(int i = 0;i<m;i++){
            System.out.println(answer[i]);
        }
    }
}