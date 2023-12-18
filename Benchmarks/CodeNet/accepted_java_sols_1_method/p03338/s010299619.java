import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int max = 0;
    Set<String> st1 = new HashSet<String>();
    Set<String> st2 = new HashSet<String>();
    for(int i = 1;i<n;i++){
      for(int j = 0;j<i;j++){
        st1.add(s.substring(j,j+1));
      }
      List<String> li = new ArrayList<String>(st1);
      for(int j = i;j<n;j++){
        st2.add(s.substring(j,j+1));
      }
      int count = 0;
      for(int j = 0;j<li.size();j++){
        if(st2.contains(li.get(j))){
          count++;
        }
      }
      max = Math.max(max,count);
      st1.clear();
      st2.clear();
      li.clear();
    }
    System.out.println(max);
  }
}
