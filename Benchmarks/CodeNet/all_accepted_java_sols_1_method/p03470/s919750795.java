import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Set<Integer> d = new HashSet<Integer>();
    int n = scan.nextInt();

    for(int i = 0; i < n; i++){
      d.add(scan.nextInt());
    }

    System.out.println(d.size());
  }
}