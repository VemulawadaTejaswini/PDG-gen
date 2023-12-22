import java.util.*;
import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Map <Integer,Integer> map = new TreeMap<>();

    for(int i=1 ; i<=n ; i++){
      map.put(sc.nextInt(),i);
    }

    for(int i=1 ; i<=n ; i++){
      System.out.print(map.get(i)+" ");
    }
  }
}