import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] s = sc.next().toCharArray();
    HashMap<String,Integer> map1 = new HashMap<>();
    HashMap<Integer,String> map2 = new HashMap<>();
    int p=0;
    for(char c='A';c<='Z';c++){
      map1.put(String.valueOf(c),p);
      map2.put(p,String.valueOf(c));
      p++;
    }
    for(int i=0;i<s.length;i++){
      int k = (map1.get(String.valueOf(s[i]))+n)%26;
      System.out.print(map2.get(k));
    }
    System.out.println("");
  }
}