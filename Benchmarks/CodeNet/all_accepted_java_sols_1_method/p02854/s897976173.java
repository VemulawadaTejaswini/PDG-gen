import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      double lng = 0;
      double[] a = new double[n];
      for(int i=0;i<n;i++){
        a[i] = Double.parseDouble(sc.next());
        lng += a[i];
      }

      double hidari = 0.0;
      double center = lng/2;
      double migi = 0.0;

      double ch = a[0];
      if(ch>=center){
        hidari = 0.0;
        migi = ch;
      }
      else{
        for(int i=1;i<n;i++){
          ch += a[i];
          if(ch>=center){
            hidari = ch -a[i];
            migi = ch;
            break;
          }
        }
      }
      //System.out.println(hidari+" "+center+" "+migi);

      int ans = 0;

      if(hidari==center || center==migi){
        System.out.println("0");
      }
      else{
////////////////////////////////////////////////////////////
double min = Math.min((center-hidari),(migi-center));

min = min*2;
System.out.println((int)min);
////////////////////////////////////////////////////////////
      }




    }
}
