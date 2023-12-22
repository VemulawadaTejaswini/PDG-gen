import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();
    int num = 0;
    
    int asl[] = new int [26];
    int asr[] = new int [26];
    String strl;
	String strr;
    
    int max = 0;
    int count = 0;

    for(int j = 1; j<n; ++j){
      for(int i = 0; i<26; ++i){
        asl[i] = 0;
        asr[i] = 0;
      }
      strl = s.substring(0,j);
      strr = s.substring(j,n);
      
      for(int i = 0 ; i < strl.length() ; ++i){
        num = (int)strl.charAt(i) - 97;
        asl[num] =1;
      }
      for(int i = 0 ; i < strr.length() ; ++i){
        num = (int)strr.charAt(i) - 97;
        asr[num] =1;
      }
      for(int i = 0 ; i < 26 ; ++i){
        if((asl[i] ==1) && (asr[i] == 1)){
          count++;
        }
      }
      
      max = Math.max(max,count);
      count = 0;
    }
    
    System.out.println(max);

  }
}