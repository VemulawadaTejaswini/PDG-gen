import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<Integer> time = new ArrayList<Integer>();
    for (int i=0; i<n; i++) {
      String a = sc.next();
      int b = sc.nextInt();
      name.add(a);
      time.add(b);
    }
    String s = sc.next();
    
    int ans = 0;
    for (int i=name.indexOf(s)+1; i<n; i++){
      ans += time.get(i);
    }
    System.out.println(ans);    
  }
}