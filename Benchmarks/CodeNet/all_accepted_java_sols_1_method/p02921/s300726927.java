import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String str1 = sc.next();
    String str2 = sc.next();
    int cnt = 0;
    
    for(int i=0; i<3; i++){
      if(str1.charAt(i)==str2.charAt(i)){
        cnt++;
      }
    }
    
    System.out.println(cnt);
  }
}