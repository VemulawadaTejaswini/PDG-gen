import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int max = 0;
    int k = 0;
    ArrayList<Integer> array = new ArrayList<Integer>();
    for(int i = 0;i < num;i++){
      int n = sc.nextInt();
      array.add(n);
      if(max < n){
        max = n;
        k = i;
      }
    }
    array.remove(k);
    int sum = 0;
    for(Integer i : array){
      sum += i;
    }
    if(max < sum){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
    