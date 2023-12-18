import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Integer> red = new ArrayList<>();
    for(int i = 0; i < N; i++){
      String[] S = sc.nextLine().split(" ");
      int a = Integer.parseInt(S[0]);
      int b = Integer.parseInt(S[1]);
      int n = a * 1000 + b;
      red.add(n);
    }
    List<Integer> blue = new ArrayList<>();
    for(int i = 0; i < N; i++){
      String[] S = sc.nextLine().split(" ");
      int a = Integer.parseInt(S[0]);
      int b = Integer.parseInt(S[1]);
      int n = a * 1000 + b;
      blue.add(n);
    }
    Collections.sort(red, Collections.reverseOrder());
    Collections.sort(blue);
    
    for(int i = 0; i < blue.size(); i++){
      int ymax = -1;
      int temj = -1;
      for(int j = 0; j < red.size(); j++){
        int r = red.get(j);
        if(blue.get(i)-1000 > r){
          if(r % 1000 > ymax && r % 1000 < blue.get(i) % 1000){
            ymax = r % 1000;
            temj = j;
          }
        }
      }
      if(ymax >= 0){
        red.remove(temj);
        blue.remove(i);
        i--;
      }
    }
    System.out.println(N-blue.size());
  }
}