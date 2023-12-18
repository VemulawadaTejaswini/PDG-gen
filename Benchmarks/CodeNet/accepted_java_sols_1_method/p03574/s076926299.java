import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();

    String s[] = new String[h];
    for (int i = 0; i < h ; i++) {
      s[i] = sc.next();
    }
    
    String t[] = new String[w];
    for (int i = 0; i < h ; i++) {
      String b = "";
      for (int j = 0; j < w; j++) {
        int a = 0;
        if (s[i].substring(j, j+1).equals("#")){
          b += "#";
        } else {
          if (i > 0 && j > 0 && s[i-1].substring(j-1, j).equals("#")) a++;
          if (i > 0 && s[i-1].substring(j, j+1).equals("#")) a++;
          if (i > 0 && j < w-1 && s[i-1].substring(j+1, j+2).equals("#")) a++;
          if (j > 0 && s[i].substring(j-1, j).equals("#")) a++;
          if ( j < w-1 && s[i].substring(j+1, j+2).equals("#")) a++;
          if (i < h-1 && j > 0 && s[i+1].substring(j-1, j).equals("#")) a++;
          if (i < h-1 && s[i+1].substring(j, j+1).equals("#")) a++;
          if (i < h-1 && j < w-1 && s[i+1].substring(j+1, j+2).equals("#")) a++;
          b += String.valueOf(a);
        }
      }
      System.out.println(b);
    }

  }  
}
