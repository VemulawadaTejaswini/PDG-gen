import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<Integer> set = new HashSet<Integer>();
    for(int i = 0; i < N; i++){
        int A = sc.nextInt();
        if(set.contains(A)){
            set.remove(A);
        }else{
            set.add(A);
        }
    }
    System.out.println(set.size());
    
  }
}
