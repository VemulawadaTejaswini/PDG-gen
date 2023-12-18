import java.util.*;
class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] num = new int[100001];
       long sum = 0;
       for(int i = 0;i < n;i++){
            int a = sc.nextInt();
            sum += a;
            num[a]++;
       }
       int q = sc.nextInt();
       for(int i = 0;i < q;i++){
            int data = sc.nextInt();
            int change = sc.nextInt();
            int sa = change - data;
            sum += sa * num[data];
            num[change] += num[data];
            num[data] = 0;
            System.out.println(sum);
       }
   }
}
