import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    char a[] = new char[3];
    for(int i=0 ; i<3 ; i++){
      a[i] = n.charAt(i);
    }
    if(a[0]==a[2]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
