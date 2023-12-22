import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
      int l = sc.nextInt();
      int res=0;
      if(l>0){
        res=(2*l+n)*(n-1)/2;
      }else if(l+n-1<0){
        res=(2*l+n-2)*(n-1)/2;
      }else{
        res=(2*l+n-1)*n/2;
      }
        System.out.println(res);
    }

}
