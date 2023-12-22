import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    String t = sc.nextLine();

    char[] schar = s.toCharArray();
    char[] tchar = t.toCharArray();

    int[] diff = new int[s.length() - t.length() + 1];

    for(int i=0; i<schar.length - tchar.length + 1; i++){
      for(int j=0; j<tchar.length; j++){
        if(schar[i + j] != tchar[j]){
          diff[i]++;
        }
      }
    }

    int min = 10000;
    for(int i=0; i<diff.length; i++){
      if(min > diff[i]){
        min = diff[i];
      }
    }

    System.out.println(min);

    return;

  }
}

