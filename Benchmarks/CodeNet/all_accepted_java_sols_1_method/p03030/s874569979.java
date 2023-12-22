import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int p = 0;
    String s[] = new String[n];
    String sa[] = new String[n];
    
    for (int i=0; i<n; i++){ 
      s[i] = sc.next();
      p = Integer.parseInt(sc.next());
      for (int j=0; j<100-p; j++){
        s[i] = s[i] + "-";
      }
    }

    for (int i=0; i<n; i++){
      sa[i] = s[i];
    }
    Arrays.sort(sa);
    //System.out.println(Arrays.asList(s));
    
    for (int i=0; i<n; i++){
      
      for (int j=0; j<n; j++){
        if(s[j].equals(sa[i])){
          System.out.println(j+1);
        }
      }

    }
    
    //System.out.println(ans);
  }
}
