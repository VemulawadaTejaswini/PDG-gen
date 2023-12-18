import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] head = new long[5];
    for(int i = 0;i<n;i++){
      String s = sc.next();
      char[] c = s.toCharArray();
      if(c[0]=='M'){
        head[0]++;
      }else if(c[0]=='A'){
        head[1]++;
      }else if(c[0]=='R'){
        head[2]++;
      }else if(c[0]=='C'){
        head[3]++;
      }else if(c[0]=='H'){
        head[4]++;
      }
    }
    long ans = 0l;
    for(int i = 0;i<3;i++){
      for(int j = i+1;j<4;j++){
        for(int k = j+1;k<5;k++){
          ans += head[i]*head[j]*head[k];
        }
      }
    }
    System.out.println(ans);
  }
}
