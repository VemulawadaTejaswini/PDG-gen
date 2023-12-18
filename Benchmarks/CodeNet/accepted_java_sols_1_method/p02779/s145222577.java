import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<Integer> num = new HashSet<>();
    for(int i=0; i<N; i++){
      int tmp = sc.nextInt();
      if(num.contains(tmp)){
        System.out.println("NO");
        return;
      }
      num.add(tmp);
    }
    System.out.println("YES");
  }
}
