import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<String> list = new ArrayList<String>();
    int highs = 0;
    for(int i = 0; i < n; i++) {
      int rating = sc.nextInt();
      String color = "";
      if(rating <= 399)
        color = "gray";
      else if(rating <= 799)
        color = "brown";
      else if(rating <= 1199)
        color = "green";
      else if(rating <= 1599)
        color = "cyan";
      else if(rating <= 1999)
        color = "blue";
      else if(rating <= 2399)
        color = "yellow";
      else if(rating <= 2799)
        color = "orange";
      else if(rating <= 3199)
        color = "red";
      else {
        highs++;
      }
      if(color.length() > 0) {
        if(!list.contains(color))
          list.add(color);
      }
    }
    int min = -1;
    if(list.size() == 0)
      min = 1;
    else
      min = list.size();
    int max = list.size() + highs;
    System.out.println(min + " " + max);
  }
}
