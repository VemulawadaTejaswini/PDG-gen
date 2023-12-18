import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    char[][] c = new char[h][w];
    for(int i=0;i<h;i++){
      String s = sc.next();
      for(int j=0;j<w;j++){
        c[i][j] = s.charAt(j);
      }
    }
    int ans = 0;
    for (int i=0;i<Math.pow(2,h);i++) {
      for (int j=0;j<Math.pow(2,w);j++) {
         int bCount=0;
         for(int l=0;l<h;l++){
           for(int m=0;m<w;m++) {
             if (((i>>l&1)==1) || ((j>>m&1)==1)) {
               continue;
             }else{
               if(c[l][m]=='#') {
                 bCount++;
               }
             }
           }
         }
        if (bCount==k) {
          ans++;
        }
      }
    }
    System.out.println(ans);           
  }
}