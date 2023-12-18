import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    Map<Character,Character> mp=new HashMap<>();
    for(int i=0;i<s.length();i++){
      if(mp.containsKey(s.charAt(i))){
        if(mp.get(s.charAt(i))!=t.charAt(i)){
          System.out.println("No");
          return;
        }
      }else{
        mp.put(s.charAt(i),t.charAt(i));
      }
    }
    Set<Character> st=new HashSet<>();
    int cnt=0;
    for(Map.Entry<Character,Character> me:mp.entrySet()){
      st.add(me.getValue());
      cnt++;
    }
    if(st.size()<cnt){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}