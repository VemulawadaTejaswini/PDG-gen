import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int x = sc.nextInt();
        int res = 0,flag=1;
        int[] l= new int[n];
        for(int i=0;i<n;i++){
          l[i]=sc.nextInt();
          res+=l[i];
          if(res>x){
            break;
          }
          flag++;
        }
        System.out.println(flag);
    }

}


