import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char[] c=sc.next().toCharArray();
    int ans=0;
    for(int i=0;i<c.length/2;i++){
      if(c[i]!=c[c.length-1-i]){
        ans++;
      }
    }
    System.out.println(ans);
  }
}