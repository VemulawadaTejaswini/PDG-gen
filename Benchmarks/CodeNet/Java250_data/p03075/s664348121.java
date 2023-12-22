import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int[] a=new int[5];
        for(int i=0;i<5;i++){
          a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int flag=0;
        for(int i=0;i<4;i++){
          for(int j=i+1;j<5;j++){
            flag+=(a[j]-a[i])>k?1:0;
          }
        }
        // 出力
        System.out.println(flag>0?":(":"Yay!");
    }
}
