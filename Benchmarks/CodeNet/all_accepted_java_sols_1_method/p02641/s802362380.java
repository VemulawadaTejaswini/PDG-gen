import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int n = sc.nextInt();

    List<Integer> p = new ArrayList<Integer>();
    for(int i=0; i<n; i++){
      p.add(sc.nextInt());
    }

    int abs = 0;
    while(true){
      if(!p.contains(x - abs)){
        System.out.println(x-abs);
        break;
      }else if(!p.contains(x + abs)){
        System.out.println(x + abs);
        break;
      }

      abs++;
    }
    
    return;
  }
}