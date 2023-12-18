import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //入力受け取り
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    
    //アルファベット生成
    char[] alpha = new char[26];
    char fir = 'A';
    for(int i=0; i<26; i++){
      alpha[i] = fir++;
    }
    
    for(int i=0; i<s.length(); i++){
      for(int j=0; j<26; j++){
        if(c[i] == alpha[j]){
          if(j + n < 26){
            c[i] = alpha[j+n];
            break;
          }else{
            int k = (j+n) - 26;
            c[i] = alpha[k];
            break;
          }
        }
      }
    }
    
    for(int i=0; i<s.length(); i++){
      System.out.print(c[i]);
    }
  }
}
