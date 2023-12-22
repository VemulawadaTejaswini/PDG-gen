import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    ArrayList<Integer> r = new ArrayList<>();
    ArrayList<Integer> w = new ArrayList<>();
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='R'){
        r.add(i);
      }
      else{
        w.add(i);
      }
    }
    int i1=0;
    int j1=r.size()-1;
    int ans=0;
    while(i1<w.size() && j1>=0){
      if(w.get(i1)<r.get(j1)){
        ans++;
      }
      i1++;
      j1--;
    }
    System.out.println(ans);
  }
}