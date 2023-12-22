import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    boolean ju[] = new boolean[100001];
    int pe[] = new int[100001];
    
    for(int i = 0 ; i < m ; ++i){
      int no = sc.nextInt();
      String res = sc.next();
      no--;
      
      if(res.equals("WA") && ju[no] != true){
        pe[no]++;
      }
      if(res.equals("AC")){
        ju[no] = true;
      }
      
    }
    
    int ac = 0;
    int wa = 0;
    
    for(int i = 0 ; i < n ; ++i){
      if(ju[i]){
        ac++;
        wa += pe[i];
      }
      
    }
    
    System.out.println(ac + " " + wa);
    
  }
}