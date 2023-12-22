import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      int n, m, i = 0, j = 0;

      n = Integer.parseInt(scan.next());
      String s[] = new String[n];

      while(i < n){
        s[i] = scan.next();
        i = ++i;
      }

      m = Integer.parseInt(scan.next());
      String t[] = new String[m];
      i = 0;
      while(i < m){
        t[i] = scan.next();
        i = ++i;
      }

      int count[] = new int[n];

      for(i = 0; i < n; i++){
        count[i] = 0;
        for(j = 0; j < n; j++){
          if(s[i].equals(s[j])){
            count[i] = ++count[i];
          }
        }
        for(j = 0; j < m; j++){
          if(s[i].equals(t[j])){
            count[i] = --count[i];
          }
        }
      }

      for(i = 0; i < n-1; i++){
        if(count[i] > count[i+1]){
          count[i+1] = count[i];
        }
      }
      if(count[n-1]>0){
        System.out.println(count[n-1]);
      }else{
        System.out.println(0);
      }
    }
    catch (Exception e) {

    }
  }
}
