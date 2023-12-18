import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] alp1 = new int[26];
    int[] alp2 = new int[26];
    for(int i = 0; i < 26; i++){
      alp1[i] = 50;
    }
     
    for(int i = 0; i < N; i++){
      String S = sc.nextLine();
      for(int j = 0; j < S.length(); j++){
        alp2[(int)S.charAt(j)-97]++;
      }
      for(int j = 0; j < 26; j++){
        if(alp1[j] > alp2[j]){
          alp1[j] = alp2[j];
        }
        alp2[j] = 0;
      }
    }
    for(int i = 0; i < 26; i++){
      for(int j = 0; j < alp1[i]; j++){
        System.out.print((char)(i+97));
      }
    }
    System.out.println("");
  }
}