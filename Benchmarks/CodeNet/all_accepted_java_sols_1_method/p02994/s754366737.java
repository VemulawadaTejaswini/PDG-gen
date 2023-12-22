import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int l = sc.nextInt();
      int[] data = new int[n];
      int sum = 0;
      for (int i = 0;i<n ;i++ ) {
        data[i] = l+i;
        sum += data[i];
      }

      if(data[n-1]<0){
        System.out.println(sum-data[n-1]);
        System.exit(0);
      }

      if(l>0){
        sum -= data[0];
        System.out.println(sum);
      }else{
        System.out.println(sum);
      }


}
}
