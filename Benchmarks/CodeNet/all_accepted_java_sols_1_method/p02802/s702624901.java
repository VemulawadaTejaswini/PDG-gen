import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int p[] = new int[m];
    String s[] = new String[m];
    int ac[] = new int[n];
    int wa[] = new int[n];
    int spena = 0;
    int sac = 0;
    
    if(m==0){
      System.out.println("0 0");
      return;
    }
    
    for(int i=0; i<n; i++){
      ac[i] = 0;
      wa[i] = 0;
    }
    
    for(int i=0; i<m; i++){
      p[i] = Integer.parseInt(sc.next());
      s[i] = sc.next();
    }
    
    for(int i=0; i<m; i++){
      if(ac[p[i]-1]>0){
        continue;
      }
      if(s[i].equals("AC")){
        ac[p[i]-1] += 1;
      } else if(s[i].equals("WA")){
        wa[p[i]-1] += 1;
      }
    }
    
    for(int i=0; i<n; i++){
      sac += ac[i];
      if(ac[i]>0){
        spena += wa[i];
      }
    }
    
    System.out.println(sac + " " + spena);
  }
}

