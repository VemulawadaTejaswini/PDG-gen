import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
  
    int n = s.nextInt();
  
    while( n > 0){
        int max_p = 0;
        int max_d = 0;
      
        for(int i=0; i<n; ++i){
            int p = s.nextInt();
            int d1 = s.nextInt();
            int d2 = s.nextInt();
            if( max_d < d1 + d2 ){
                max_d = d1 + d2;
                max_p = p;
            }
        }
      
        System.out.println(max_p +" "+ max_d);
      
        n = s.nextInt();
    }
  }
}
