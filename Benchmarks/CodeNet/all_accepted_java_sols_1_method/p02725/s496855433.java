import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    List<Integer> a = new ArrayList<Integer>();
    for(int i = 0; i < n; i++){
      a.add(sc.nextInt());
    }
    a.add(a.get(0) + k);
    int max_Length = 0;
    for(int j = 0; j < n; j++){
      int temp = a.get(j+1) - a.get(j);
      if(temp > max_Length){
        max_Length = temp;
      }
    }
    int ans = k - max_Length;
    System.out.println(ans);
  }
}