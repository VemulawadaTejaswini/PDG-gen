import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //Map<String, Integer> map = new HashMap<String, Integer>();
    int n = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    int findID = 0;
    double min = 1000000.0;

    for(int i = 0; i < n; i++){
      int h = sc.nextInt();
      double d = Math.abs(a-(t-0.006*h));
      if(min >= d){
        min = d;
        findID = i+1;
      }
    }

    System.out.println(findID);

  }
}
