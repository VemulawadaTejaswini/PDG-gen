import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = Integer.parseInt(sc.nextLine());
    String line = sc.nextLine();

    char[] c = line.toCharArray();

    int rNum = 0;
    for(int i=0; i<n; i++){
      if(c[i] == 'R') rNum++;
    }

    int rToMove = 0;
    int wToMove = 0;
    for(int i=0; i<n; i++){
      if( i < rNum && c[i] == 'W') wToMove++;
      else if ( i >= rNum && c[i] == 'R' ) rToMove++;
    }

    if(wToMove < rToMove){
      System.out.println(wToMove);
    }else{
      System.out.println(rToMove);
    }
    
    return;

  }
}