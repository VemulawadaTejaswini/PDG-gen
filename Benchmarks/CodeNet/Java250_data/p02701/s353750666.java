import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String[] s = new String[n];
    int ans = 0;
    
    for(int i=0; i<n; i++){
		s[i] = sc.next();
    }
      
    System.out.println(elmDup(s));
  }
  
   static int elmDup(String[] s) {
    Set<String> linkedHashSet = new LinkedHashSet<String>();

    for (int i = 0; i < s.length; i++) {
    linkedHashSet.add(s[i]);
    }

    Object[] s_after = linkedHashSet.toArray();
     
     return s_after.length;
  }
}