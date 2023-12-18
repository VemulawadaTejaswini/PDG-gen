import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String t = scan.next();
    char[] a = new char[n];
    for (int i=0;i<n;i++){
      a[i] = t.charAt(i);
    }

    String f = Character.toString(a[0]);
    for (int j=1;j<n;j++){
      int p = f.length();
      if (a[j] == f.charAt(p-1)){
        continue;
      }
      else{
        f += Character.toString(a[j]);
      }
    }
    System.out.println(f.length());
  }
}
