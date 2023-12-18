import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();

    String[] c = new String[h];

    for(int i=0; i<h; i++){
      c[i] = sc.next();
    }
    
    int selection_row = 1 << h;
    int selection_col = 1 << w;
    int count = 0;

    for(int row=0; row<selection_row; row++){
      for(int col=0; col<selection_col; col++){

        int black = 0;

        for(int i=0; i<h; i++){
          for(int j=0; j<w; j++){
            int r = (1 << i) & row;
            int co = (1 << j) & col;
            if( r > 0 && co > 0 ){
              if(c[i].charAt(j) == '#')  black++;
            }

          }
        }

        if(black == k) count++;
      }
    }

    System.out.println(count);
  }
}