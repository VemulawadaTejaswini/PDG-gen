import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<Integer> hash_set = new HashSet<Integer>();
    for (int i = 0; i < N; i++) {
       hash_set.add((Integer)sc.nextInt());
    }
    if(hash_set.size()  ==(Integer)N){
      System.out.print("YES");
    }else{
    System.out.print("NO");
    }
}  
}