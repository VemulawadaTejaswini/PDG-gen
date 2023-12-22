import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{  
  public static void main(String[] args){   
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();   
    ArrayList<Integer> a = new ArrayList<>();
    for(int i=0; i<n ; i++){
      int k = scn.nextInt();
      int[] b = new int[k];
       for(int j=0; j<k ; j++){
         b[j] = scn.nextInt();
         a.add(b[j]);
       }   
    }
    Collections.sort(a);
    ArrayList<Integer> c = new ArrayList<>();
    int count = 0;
    for(int i=1; i<=m  ; i++){
      for(int j = 0; j < a.size(); j++){
        int x = a.get(j);
        if(x == i){
          count = count + 1;
        }
      }
      c.add(count);
      count = 0;
    }
      
    int count2 = 0;
    for(int i=0; i<c.size(); i++){
      if(c.get(i) == n){
        count2 = count2 + 1;
      }
    }
    System.out.println(count2);   
  }  
}
