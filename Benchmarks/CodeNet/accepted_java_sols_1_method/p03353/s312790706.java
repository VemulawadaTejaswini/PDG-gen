import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int k = sc.nextInt();
    int n = s.length();
    HashSet<String> set = new HashSet<>();
    for(int i=0;i<n;i++){
      for(int j=1;j<=Math.min(k,n-i);j++){
        set.add(s.substring(i,i+j));
      }
    }
    ArrayList<String> list = new ArrayList<>(set);
    Collections.sort(list);
    System.out.println(list.get(k-1));
  }
}