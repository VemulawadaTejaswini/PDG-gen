import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void swap(ArrayList<Integer> list, int a, int b){
    int c = list.get(a);
    list.set(a, list.get(b));
    list.set(b, c);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    try {
      int w = sc.nextInt();
      int n = sc.nextInt();
      for(int i=1;i<=w;i++){
        list.add(i);
      }
      for(int i=0;i<n;i++){
        String[] s = sc.next().split(",");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        swap(list, a-1, b-1);
      }
      for(Integer num : list){
        System.out.println(num);
      }
    } catch (Exception e) {
    }
    sc.close();
  }
}
