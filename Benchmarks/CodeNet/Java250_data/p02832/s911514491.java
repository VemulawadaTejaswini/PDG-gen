import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k=1;
      int ans=0;
      for(int i=0;i<n;i++){
        int a = sc.nextInt();
        if(a==k){
          k++;
        }else{
          ans++;
        }
      }
      if(k==1){
        ans=-1;
      }
      System.out.println(ans);
    }
}