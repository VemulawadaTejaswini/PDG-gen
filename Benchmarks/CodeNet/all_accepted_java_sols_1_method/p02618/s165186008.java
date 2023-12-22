import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int _26 = 26;
    int d = sc.nextInt();
    int[] c = new int[_26];
    int[][] s = new int[d][_26];
    
    for(int i=0; i<_26; i++){
      c[i] = sc.nextInt();
    }
    for(int i=0; i<d; i++){
      for(int j=0; j<_26; j++){
        s[i][j] = sc.nextInt();
      }
    }
    
    int[] r = new int[d];
    int[] r_i = new int[d];
    for(int i=0; i<d; i++){
      r[i] = s[i][0];
      r_i[i] = 1;
      for(int j=1; j<_26; j++){
        if(r[i] < s[i][j]){
          r[i] = s[i][j];
          r_i[i] = j+1;
        }
      }
    }
    
    for(int i=0; i<d; i++)
      System.out.println(r_i[i]);
  }
}