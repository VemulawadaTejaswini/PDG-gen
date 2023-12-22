import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n=sc.nextInt();
        int[] a=new int[n];
        int temp=0;
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            temp=a[i]>temp?a[i]:temp;
            sum+=a[i];
        }
        if(temp<sum-temp){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
