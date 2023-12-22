import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      String ans;

      int YYMM = 0;
      int MMYY = 0;

      int migi2 = n%100;
      int hidari2 = (n-migi2)/100;

      if(hidari2>0  && hidari2<13){
        MMYY = 1;
      }
      if(migi2>0 && migi2<13){
        YYMM = 1;
      }


      if(YYMM==1 && MMYY==1){
        ans = "AMBIGUOUS";
      }
      else if(YYMM==1 && MMYY==0){
        ans = "YYMM";
      }
      else if(YYMM==0 && MMYY==1){
        ans = "MMYY";
      }
      else{
        ans = "NA";
      }

      System.out.println(ans);

    }
}
