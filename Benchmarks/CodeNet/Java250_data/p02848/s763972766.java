import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String[] AlTable = Alphabet.split("",0);
    String ans = "";
    for(int i=0;i<S.length();i++){
      String tmp = S.substring(i,i+1);
      for(int j=0;j<26;j++){
        if(tmp.equals(AlTable[j])){
          int j2 = j + N;
          if(j2>=26){
            j2 = j2-26;
          }
          ans = ans + AlTable[j2];
        }
      }
    }
    System.out.println(ans);
  }
}