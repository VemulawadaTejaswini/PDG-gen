import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(),i=0;
        int[]a=new int[n];
        for(;i<n;){
            a[i++]=sc.nextInt();
        }
        Arrays.sort(a);
        int sum=1000000000;
        for(i=0;i+m-1<n;i++){
            sum=Math.min(sum,a[i+m-1]-a[i]);
        }
        System.out.print(sum);
    }
}
