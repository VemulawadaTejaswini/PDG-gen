import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int[] w= new int[n];
        int sum=0, temp=0;
        for(int i=0;i<n;i++){
          w[i] = sc.nextInt();
          sum+=w[i];
        }
        int res =sum;
        for(int i=0;i<n;i++){
          temp+=w[i];
          sum-=w[i];
          res=Math.abs(temp-sum)<res?Math.abs(temp-sum):res;
        }
        System.out.println(res);
            
        // 出力
       
    }
}
