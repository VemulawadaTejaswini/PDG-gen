import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    Set<Integer> set = new HashSet<>();
    set.add(s);

    for(int i = 2 ; i < 1000001 ; ++i){
      if(s%2 == 0){
        s = s/2;
      }else{
        s = s*3 + 1;
      }
      if(set.add(s)){
        set.add(s);
      }else{
        System.out.println(i);
        break;
      }
    }
    
  }
}