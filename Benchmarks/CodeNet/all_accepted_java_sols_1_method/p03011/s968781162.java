import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[] a = new int[3];
      for(int i=0;i<3;i++){
        a[i]=sc.nextInt();
      }

      int ans1 = 101;
      ///////////////////////////////////////////////
      for(int j=0;j<3;j++){
        if(a[j]<ans1){
          ans1 = a[j];
        }
      }
      for(int j=0;j<3;j++){
        if(a[j]==ans1){
          a[j] = 101;
          break;
        }
      }
      ///////////////////////////////////////////////

      int ans2 = 101;
      ///////////////////////////////////////////////
      for(int j=0;j<3;j++){
        if(a[j]<ans2){
          ans2 = a[j];
        }
      }
      for(int j=0;j<3;j++){
        if(a[j]==ans2){
          a[j] = 101;
          break;
        }
      }
      ///////////////////////////////////////////////


      System.out.println(ans1+ans2);

    }

}
