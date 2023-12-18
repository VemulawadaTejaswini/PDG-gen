import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String blank = sc.nextLine();
    char[][] array = new char[h][w];
    Set<Integer> h_black_idx = new TreeSet<>();
    Set<Integer> w_black_idx = new TreeSet<>();

    for(int i = 0; i < h; i++){
      String s = sc.nextLine();
      array[i] = s.toCharArray();
    }

    for(int i = 0; i < h; i++){
      for(int j = 0; j < w; j++){
        if(array[i][j] == '#'){
          h_black_idx.add(i);
          w_black_idx.add(j);
        }
      }
    }

    for(Integer i : h_black_idx){
      for(Integer j : w_black_idx){
        System.out.print(array[i][j]);
      }
      System.out.println("");
    }

  }
}
