import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
    int b = sc.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    for(int i=1;i<=a;i++){
      int tmp = sc.nextInt();
      list.add(tmp);
    }
    Collections.sort(list);
    int sum = 0;
    for(int i=0;i<b;i++){
      sum+=list.get(i);
    }
    System.out.println(sum);
  }
}