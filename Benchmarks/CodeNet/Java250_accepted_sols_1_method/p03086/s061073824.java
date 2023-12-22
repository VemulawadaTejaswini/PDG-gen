import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    char[] S = new char[n];
    int i;
    int leng = 0;
    int max = 0;
    for(i=0;i<n;i++){
      S[i] = s.charAt(i);
    }
    for(i=0;i<n;i++){
      if(S[i]=='A'||S[i]=='C'||S[i]=='G'||S[i]=='T'){
        leng = leng + 1;
      }else{
        if(max<leng){
          max = leng;
          leng = 0;
        }else{
          leng = 0;
        }
      }
    }
    if(leng>max){
      max = leng;
    }
    System.out.println(max);    
 }
}