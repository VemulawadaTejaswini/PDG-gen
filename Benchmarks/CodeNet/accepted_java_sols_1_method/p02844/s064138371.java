import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String s = sc.next();
    
    String tri = null;
    String target = null;
    int ans = 0;
    
    String[] p = new String[n];
	String[] pt = new String[3];
    int cont = 0;
    int point = 0;
    
    for(int i=0; i<n; i++){
      p[i] = s.substring(i, i+1);
    }
    
    for(int i = 0; i<1000; i++){
      target = String.format("%03d", i);
      for(int k=0; k<3; k++){
        pt[k] = target.substring(k, k+1);
      }
      
      cont = 0;
      point = 0;
      for(int k=0; k<3; k++){
        for(int j=cont; j<n; j++){
          if(pt[k].equals(p[j])){
            cont = j + 1;
            point++;
            break;
          }
        }
      }
             
      if(point == 3){
        ans++;
      }
    }
             
    System.out.println(ans);
    
  }
}
