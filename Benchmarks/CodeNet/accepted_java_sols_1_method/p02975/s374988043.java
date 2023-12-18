import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      boolean n3 = (n%3==0);

      int[] a = new int[n];

      for(int i=0;i<n;i++){
        a[i] = Integer.parseInt(sc.next());
      }

      String ans = "No";

      Arrays.sort(a);

///////////////////////////////////////////////
if(a[n-1]==0){
  ans ="Yes";
}
///////////////////////////////////////////////

///////////////////////////////////////////////
if(n3 && a[n/3-1]==0 && a[n/3]==a[n-1]){
  ans ="Yes";
}
///////////////////////////////////////////////

///////////////////////////////////////////////
int c = a[0]^a[n/3]^a[n-1];
boolean OOO = (c==0);
boolean a1 = (a[0]==a[n/3-1]);
boolean a2 = (a[n/3]==a[2*n/3-1]);
boolean a3 = (a[2*n/3]==a[n-1]);
boolean xyz1 = (a[0]!=a[n/3]);
boolean xyz2 = (a[n/3]!=a[n-1]);
if(n3 && a1 && a2 && a3 && xyz1 && xyz2 & OOO){

    ans ="Yes";
}
///////////////////////////////////////////////


      System.out.println(ans);

    }
}
