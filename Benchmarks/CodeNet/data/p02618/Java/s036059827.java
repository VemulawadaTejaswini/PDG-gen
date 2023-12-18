import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int d = sc.nextInt();
    /*
    int[] c = new int[26]; //array of decrease
    for(int i = 0; i < c.length; i++){
      c[i] = sc.nextInt();
    }
    */

    int[] c = new int[26];
    for(int i = 0; i < 26; i++){
      c[i] = sc.nextInt();
    }

    int[][] s = new int[d][26]; //two dimensional array of increase
    for(int row = 0; row < s.length; row++){ //day
      for(int col = 0; col < s[row].length; col++){ //contest number
        s[row][col] = sc.nextInt();
      }
    }
    int[] t = new int[d]; //array of contest numbers of the day
    for(int i = 0; i < t.length; i++){
      t[i] = 13;
    }

    //output
    //based on increase
    /*
    int largestNum = s[0][0];
    int largestNumRow = 0;
    int largestNumCol = 0;
    for(int row = 0; row < s.length; row++){
      for(int col = 0; col < s[row].length; col++){
        if( s[row][col] > largestNum ){
          largestNum = s[row][col];
          largestNumRow = row;
          largestNumCol = col;
        }
      }
    }

    int largestNuM = c.get(0);
    int largestNumPos = 0;
    for(int j = 0; j < c.size(); j++){
      if( c.get(j) > largestNuM ){
        largestNuM = c.get(j);
        largestNumPos = j;
      }
    }

    for(int i = 0; i < d; i++){
      if( largestNum > largestNuM ){
        System.out.println(largestNumCol+1);
      }else{
        System.out.println(largestNumPos+1);
      }
    }
    */


    /*

    for(int m = 0; m < d; m++){
      if( m%2 == 0 ){
        System.out.println(largestNumCol+1);
      }else{
        int largestNuM = c.get(0);
        int largestNumPos = 0;
        for(int j = 0; j < c.size(); j++){
          if( c.get(j) > largestNuM ){
            largestNuM = c.get(j);
            largestNumPos = j;
          }
        }
        c.remove(largestNumPos);
        System.out.println(largestNumPos+1);
      }
    }
    */



    for(int i = 0; i < d; i++){
      System.out.println((int)(Math.random()*26+1));
      //System.out.println(largestNumCol+1);
    }

    /*
    int value = 0;
    for(int i = 0; i < t.length; i++){
      int contestNum = t[i]-1;
      int day = i+1;
      value += s[day-1][contestNum]; //increase
      for(int j = 0; j < c.length; j++){
        if( !(j == contestNum) ){
          int daySinceLast = day;
          for(int m = 0; m < i; m++){
            if( j == t[m]-1 ){
              daySinceLast = day-m-1;
            }
          }
          value -= c[j]*(daySinceLast); //decrease (amount of decrease * days since last one)
        }
      }
      System.out.println(value);
    }
    */


  }
}
