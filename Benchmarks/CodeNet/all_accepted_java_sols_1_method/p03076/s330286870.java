import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int temp = 0;
        int i = 0;
        int e = 0;
        //余りが一番小さいものを最後に注文する。
        int r[] = new int[5];
        int s = 11;
        int t = 11;
        for(int k = 0; k<5; k++){
          r[k] = sc.nextInt();
        }

        for(i = 0; i < 5; i++){
          s = Math.min(t,r[i]%10);
          if(t != s && r[i]%10 !=0){
          e = i;
          t = s; 
          }
        }
        temp = r[4];
        r[4] = r[e];
        r[e] = temp;

        for(int j = 0; j < 4; j++){
          if(r[j] % 10 != 0){
            sum = 10 - (r[j] % 10) + r[j] +sum;
          }else{
            sum += r[j];
          }
        }
        sum += r[4];
        System.out.println(sum);
    }
}
