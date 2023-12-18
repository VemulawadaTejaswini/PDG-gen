import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=0;
        int num[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
            max=Math.max(max,num[i]);
            sum+=num[i];
        }
        System.out.println(sum-max/2);
    }
}