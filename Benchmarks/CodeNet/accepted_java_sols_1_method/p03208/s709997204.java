import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]num=new int[n];
        for(int i=0;i<n;){
            num[i++]=sc.nextInt();
        }
        	
        Arrays.sort(num);
        int sum=1000000000;
        for(int i=0;i+m-1<n;i++){
            int nsum=0;
            nsum+=num[i+m-1]-num[i];
            sum=Math.min(sum,nsum);
        }
        System.out.println(sum);
    }
}
