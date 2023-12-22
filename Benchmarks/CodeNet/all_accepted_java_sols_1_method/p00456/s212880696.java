import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] t = new int[10];
    int[] s = new int[10];

    for(int i=0;i<10;i++){
      t[i] = sc.nextInt();
    }
    for(int i=0;i<10;i++){
      s[i] = sc.nextInt();
    }

    Arrays.sort(t);
    Arrays.sort(s);

    System.out.println((t[9] + t[8] + t[7]) + " " + (s[9] + s[8] + s[7]));
  }
}