import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int x = Integer.parseInt(sc.next());
         int ans = 1;
         for(int i =2;i<=x;i++){
             for(int j = i*i;j<=x;j=j*i){
                 ans = Math.max(ans,j);
             }
         }
         System.out.println(ans);
    }
}