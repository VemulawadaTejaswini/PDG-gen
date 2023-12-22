import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    char[] c = n.toCharArray();
    
    int cnt = 0;
    for(int i=0; i<n.length(); i++){
      if(c[i]=='2'){
        cnt++;
      }
    }
    
    System.out.println(cnt);
  }
}
