import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();

      int ans;

      int[] a = new int[n];

      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }

      int max1=0;
      int max2=0;
      int memo1=0;
      int memo2=0;
/////////////////////////////////////////
      for(int j=0;j<n;j++){
        if(a[j]>max1){
          max1=a[j];
        }
      }
      for(int j=0;j<n;j++){
        if(a[j]==max1){
          memo1 = j;
          a[j] = 0;
          break;
        }
      }
/////////////////////////////////////////
/////////////////////////////////////////
      for(int j=0;j<n;j++){
        if(a[j]>max2){
          max2=a[j];
        }
      }
      for(int j=0;j<n;j++){
        if(a[j]==max2){
          memo2 = j;
        }
      }
/////////////////////////////////////////

      for(int i=0;i<n;i++){
        if(i!=memo1){
          System.out.println(max1);
        }
        else{
          System.out.println(max2);
        }
      }


    }
}
