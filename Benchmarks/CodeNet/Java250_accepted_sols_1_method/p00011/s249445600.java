import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int n = sc.nextInt();
    int[] ac = new int[w];
    for(int i=0;i<w;i++){
      ac[i]=i+1;
    }
    for(int i=0;i<n;i++){
      String s=sc.next();
      String[] ab=s.split(",");
      int a=Integer.valueOf(ab[0]);
      int b=Integer.valueOf(ab[1]);
      int temp = ac[a-1];
      ac[a-1] = ac[b-1];
      ac[b-1] = temp; 
    }
    for(int i=0;i<w;i++){
      System.out.println(ac[i]);
    }
  }
}
