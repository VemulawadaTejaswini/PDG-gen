import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
 
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      int m=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();
      int x2=sc.nextInt();
      for(int i=1;i<n;i++){x2=Math.max(sc.nextInt(),x2);
      }
      int y2=sc.nextInt();
      for(int i=1;i<m;i++)y2=Math.min(sc.nextInt(),y2);
      if(x2<y2&&x2<y&&y2>x&&y2<=y)
        System.out.println("No War");
    else System.out.println("War");
    }
}