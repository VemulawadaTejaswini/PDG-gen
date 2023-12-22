import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char [] c = s.toCharArray();
    char c2 ='a';
    char []alphabet = new char[26];
    for (int i = 0; i < 26; i++){
        alphabet[i] = c2++;
    }
    for(int i=0;i<26;i++){
      if(c[0]==(alphabet[i])){
        System.out.println(alphabet[i+1]);
        return;
      }
    }
         
  }
  

  
}