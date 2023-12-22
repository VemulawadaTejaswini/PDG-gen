import java.util.*;
import java.util.regex.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt(),n = sc.nextInt(),a,b,z;
    int[] amida = new int[w];
    for(int i=0;i<w;i++)amida[i]=i+1;
    for(int i=0;i<n;i++){
      String s = sc.next();
      Pattern pattern = Pattern.compile("\\D");
      String[] splitStr = pattern.split(s);
      a = Integer.parseInt(splitStr[0]);
      b = Integer.parseInt(splitStr[1]);
      z = amida[a-1];
      amida[a-1] = amida[b-1];
      amida[b-1] = z;
    }
    for(int i=0;i<w;i++)System.out.println(amida[i]);
    sc.close();
  }
}
