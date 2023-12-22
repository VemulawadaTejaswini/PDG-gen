import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    char[] ss = new char[n];
    int i;
    int total = 0;
    for(i=0;i<n;i++){
      ss[i] = s.charAt(i);
    }    
    for(i=0;i<n-1;i++){
      if(ss[i]!=ss[i+1]){
        continue;
      }else{
        total = total + 1;
        if(ss[i+1]=='0'){
          ss[i+1]='1';
          continue;
        }else{
          ss[i+1]='0';
          continue;
        }
      }
    }
    System.out.println(total); 
 }
}