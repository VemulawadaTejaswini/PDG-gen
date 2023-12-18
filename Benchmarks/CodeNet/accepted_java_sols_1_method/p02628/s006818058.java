import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<Integer> fruit = new ArrayList<Integer>();
    for(int i = 0;i < n;i++){
      fruit.add(sc.nextInt());
    }
    int sum = 0;
    Collections.sort(fruit);
    for(int i = 0;i < k;i++){
      sum += fruit.get(i);
    }
    System.out.println(sum);
  }
}