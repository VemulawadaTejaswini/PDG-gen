import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    if(n == 0){
      System.out.println(x);
      return;
    }
    int distance = 0;
    int answer = 0;
    List<Integer> list = new ArrayList();
    for(int i = 0; i < n; i++){
      list.add(sc.nextInt());
    }
    while(true){
      if(list.contains(x + distance)){
        if(distance < 0){
          distance = - distance;
        } else {
          distance = (distance + 1) * -1;
        }
      } else {
        answer = x + distance;
        break;
      }
    }
    System.out.println(answer);
  }
}