import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int pow2[] = new int[30];
    pow2[0] = 1;
    for (int i = 1; i < 30; i++) {
      pow2[i] = 2 * pow2[i - 1];
    }

    int ans=0;
    for(int i=0;i<N;i++) {
      int ai=Integer.parseInt(sc.next());;
      for(int j=1;j<30;j++) {
        if(ai%pow2[j]!=0) {
          ans+=j-1;
          break;
        } else if(j==29) {
          ans+=29;
          break;
        }
      }
    }
    
    System.out.println(ans);
  }
}