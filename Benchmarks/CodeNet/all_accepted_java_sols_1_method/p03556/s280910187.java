import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
      
        int n = sc.nextInt();
        int ans = 0;

        for(int i = 1;i*i <= n;i++){
           ans = i*i;
        }
        System.out.println(ans);
    }
}