import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int n = S.length();
    int tmp=0;
    String part[] = new String[n*(n+1)/2];
    for(int i=0;i<n;i++){
      for(int j=i;j<n;j++){
        part[tmp]=S.substring(i,j+1);
        tmp=tmp+1;
      }
    }
    int answer = 0;
    for(int i=0;i<part.length;i++){
      if(isATGC(part[i])){
        if(answer<part[i].length()){
          answer=part[i].length();
        }
      }
    }
    System.out.println(answer);
    
  }
  
  public static boolean isATGC(String s){
    for(int i=0;i<s.length();i++){
      if(s.substring(i,i+1).equals("A")||s.substring(i,i+1).equals("T")||s.substring(i,i+1).equals("G")||s.substring(i,i+1).equals("C")){
        continue;
      }else{
        return false;
      }
    }
    return true;
  }
  

  
}