import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    String x = sc.next();
    String y = sc.next();
    char[] c= x.toCharArray();
    char[] d= y.toCharArray();
    for(int i = 0; i < c.length;i++){
      if (c[i] != d[i]){
        System.out.println("No");
        return;
      }
    }
    if (c.length+1 != d.length){
     System.out.println("No");
      return;
    }
        
    System.out.println("Yes");
  }
}
