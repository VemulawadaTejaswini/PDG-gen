import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> list = new ArrayList<>(n);
    for(int i = 0;i < n; i++){
      list.add(sc.nextInt());
      }
    Collections.sort(list);
    System.out.println(Math.abs(list.get(list.size() -1) - list.get(0)));
                       }}
