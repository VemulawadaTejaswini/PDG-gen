import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] Alp = new int[26];
    int [] count = new int[26];
    Arrays.fill(count, 0);
    int k;
    Alp[0] = 'a';
    for(int i=1;i<26;i++){
      Alp[i] = Alp[0] + i;
    }
    while(sc.hasNext()){
      String sen = sc.next();
      sen = sen.toLowerCase();
      for(int i=0;i<sen.length();i++){
        k = sen.charAt(i);
        for(int j=0;j<26;j++){
          if(Alp[j] == k){
            count[j]++;
          }
        }
      }
    }
    sc.close();
    for(int i=0;i<26;i++){
      System.out.println((char)Alp[i] + " : " + count[i]);
    }
  }
}
