import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int n = sc.nextInt();
    List<Integer> intList = new ArrayList<Integer>();
    
    for(int i = 0; i < n; i++){
      intList.add(sc.nextInt());
    }
    
    int ans = x;
    for(int i = 0; i < 100; i++){
      if(!(intList.contains(x-i))){
        ans = x - i;
        break;
      } else if (!(intList.contains(x+i))){
        ans = x + i;
        break;
      }
    }
    
    System.out.println(ans);

  }
}