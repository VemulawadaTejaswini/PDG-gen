import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    String a[] = new String[h];
    for(int i = 0 ; i < h ; ++i){
      a[i] = sc.next();
    }
    
    int count = 0;
    for(int i = 0 ; i < ((1<<h)-1) ; ++i){
      for(int j = 0 ; j < ((1<<w)-1) ; ++j){
        int kuro = 0;
        for(int o = 0 ; o < h ; ++o){
          for(int l = 0 ; l < w ; ++l){
            if(((i>>o)&1)==0 && ((j>>l)&1)==0 && a[o].charAt(l)=='#'){
              kuro++;
            }
          }
        }
        if(kuro == k){
          count++;
        }
      }
      
    }
    
    System.out.println(count);
    
  }
}
