import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int ans;
    ans = convert(a,b);
    System.out.println(ans);
  }
  public static int convert(String a, String b){
      int l = a.length();
      int count = 0;
      for(int i =0; i< l; i++){
          if(a.charAt(i) != b.charAt(i))
            count++;
      }
      return count;
  }
}