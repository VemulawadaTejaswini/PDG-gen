import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Set<Integer> koike = new HashSet<>();
    for(int i = 0; i < n; i++){
      koike.add(sc.nextInt());
    }
    if(n == koike.size()){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}