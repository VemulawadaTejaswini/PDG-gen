import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String s = sc.next();
    char a[] = new char[3];
    int count = 0;
    for(int i=0 ; i<3 ; i++){
      a[i] = s.charAt(i);
    }
    Arrays.sort(a);
    for(int i=0 ; i<3 ; i++){
      if(a[i]=='1'){
        count++;
      }
    }
    System.out.println(count);
  }
}
