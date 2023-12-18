import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int count,i,j,length;
    String ans;
    double[] length_pow = new double[3];
    count = sc.nextInt();
    for(i =0;i < count;i++){
      for(j = 0;j < 3;j++){
        length = sc.nextInt();
        length_pow[j] = Math.pow(length,2);
      }
      Arrays.sort(length_pow);
      if(length_pow[0] + length_pow[1] == length_pow[2]) ans = "YES";
      else ans = "NO";
      System.out.println(ans);
    }
  }
}