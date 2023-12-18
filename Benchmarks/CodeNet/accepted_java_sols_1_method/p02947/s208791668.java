import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<String> list = new ArrayList<>();
    
    for(int i = 0; i < N; i++){
      String s = sc.nextLine();
      char[] c = s.toCharArray();
      Arrays.sort(c);
      s = new String(c);
      list.add(s);
    }
    Collections.sort(list);
    
    long ans = 0;
    long count = 0;
    String t = "";
    String u = "";
    boolean check = false;
    for(int i = 0; i < N; i++){
      check = false;
      if(i == 0){
        t = list.get(i);
        count++;
        continue;
      }
      
      u = list.get(i);
      if(t.equals(u) && i < N-1){
        count++;
      }else if(t.equals(u) && i == N-1){
        count++;
        check = true;
      }else{
        t = u;
        check = true;
      }
      
      if(check){
        ans += (count*(count-1))/2;
        t = u;
        count = 1;
      }
    }
    System.out.println(ans);
  }
}