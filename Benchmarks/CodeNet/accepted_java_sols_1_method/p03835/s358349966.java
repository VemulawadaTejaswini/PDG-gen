import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int s=sc.nextInt();
    int cnt=0;
    sc.close();
    for(int i=Math.max(0,s-2*k);i<=Math.min(k,s);i++){
      for(int j=Math.max(0,s-i-k);j<=Math.min(k,s-i);j++){
        if((s-i-j)>=0&&(s-i-j)<=k){
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }
}