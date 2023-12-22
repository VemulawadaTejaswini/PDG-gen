import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String S = sc.next();
    char[] alpha ={'A','B','C','D','E','F','G','H','I','J'
      ,'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
   	Map<Character , Integer> map = new HashMap<>();
    StringBuilder sb =  new StringBuilder();
    for(int i=0;i<alpha.length;i++){
      map.put(alpha[i],i);
    }
	int idx;
    for(int i=0;i<S.length();i++){
      idx = map.get(S.charAt(i));
      sb.append(alpha[(idx+N)%26]);
    }
    System.out.print(sb.toString());
    
    System.out.flush();
  }
}
