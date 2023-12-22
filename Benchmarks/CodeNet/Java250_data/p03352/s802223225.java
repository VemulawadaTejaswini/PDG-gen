import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int ans = 1;
      for (int i=2;i<=Math.floor(Math.sqrt(X));i++){
       
        int tmp = i;
        while (tmp<=X){
          if (tmp*i <= X){
            tmp *= i;
          }
          else{
            ans = Math.max(ans,tmp);
            break;
          }
        }
      }
      System.out.println(ans);
    }
}