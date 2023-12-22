import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long num = -3000l;
    long b[] = new long[6000];
    long bb[] = new long[6000];
    long a[] = new long[6000];
    long aa[] = new long[6000];
    for(int i = 0;i<6000;i++){
      long gojo = num * num * num * num * num;
      b[i] = gojo;
      bb[i] = num;
      a[i] = gojo;
      aa[i] = num;
      num++;
    }
    for(int i = 0;i<6000;i++){
      for(int j = 0;j<6000;j++){
        if(a[j] - b[i] == x){
          System.out.println(aa[j] + " " + bb[i]);
          return;
        }
      }
    }
  }
}
