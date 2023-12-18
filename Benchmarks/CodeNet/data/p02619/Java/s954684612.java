import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int d = sc.nextInt();
    int[] c = new int[26]; //array of decrease
    for(int i = 0; i < c.length; i++){
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
      t[i] = sc.nextInt();
    }

    //output
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

  }
}
