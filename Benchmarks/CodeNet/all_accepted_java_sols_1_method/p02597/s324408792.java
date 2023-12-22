import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();

    //iranai tokoro wo kiriotosu
    int start = -1;
    int end = n-1;
    for(int i = 0;i<n;i++){
      if(c[i]=='W'){
        start=i;
        break;
      }
    }
    if(start == -1){
      System.out.println(0);
      return;
    }
    for(int i = n-1;i>=0;i--){
      if(c[i]=='R'){
        end=i;
        break;
      }
    }
    if(start>=end){
      System.out.println(0);
      return;
    }

    //kanngaeteiku
    //hani no aka siro kazoeru
    int total = end - start + 1;
    int white = 0;
    int red;
    for(int i = start;i<=end;i++){
      if(c[i]=='W')white++;
    }
    red = total - white;
    //tiisihou ni atehameru
    int ans = 0;
    if(red<=white){
      for(int i = 0;i<red;i++){
        if(c[start + i]=='W')ans++;
      }
      System.out.println(ans);
    }else{
      for(int i = 0;i<white;i++){
        if(c[end - i]=='R')ans++;
      }
      System.out.println(ans);
    }
  }
}
