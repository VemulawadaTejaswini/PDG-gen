import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[3];
    for (int i=0;i<3;i++) {
      a[i]=sc.nextInt();
    }

    Arrays.sort(a);

    int problem1=a[0]-a[1];
    int problem2=a[1]-a[2];

    int ans=Math.abs(problem1)+Math.abs(problem2);

    System.out.println(ans);
  }
}
