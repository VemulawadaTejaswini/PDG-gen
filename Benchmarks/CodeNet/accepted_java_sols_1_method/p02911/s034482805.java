import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());
      int q = Integer.parseInt(sc.next());

      int[] a = new int[q];
      for(int i=0;i<q;i++){
        a[i] = Integer.parseInt(sc.next());
      }

      int[] fin = new int[n];

      //before
      for(int i=0;i<q;i++){
        fin[a[i]-1]++;
      }

      //after
      for(int i=0;i<n;i++){
        if(fin[i]>=q-k+1){
          System.out.println("Yes");
        }
        else{
          System.out.println("No");
        }
      }

    }
}
