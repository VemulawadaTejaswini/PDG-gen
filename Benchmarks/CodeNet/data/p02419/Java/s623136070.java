import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    //List<Integer> list = new ArrayList<Integer>();
    //while(true)
    //{
    //  list.add(sc.nextInt());
    //}
    //for(int i=0; i<list.size(); i++)
    //{
    //  System.out.println(list.get(i));
    //}

    String word = sc.nextLine();
    String[] strArray = sc.nextLine().split(" ");
    int count=0;
    for(int i=0; i<strArray.length; i++)
    {
      if(word.equals(strArray[i].toLowerCase()))
      {
        count++;
      }
    }
    out.println(count);
  }
}
