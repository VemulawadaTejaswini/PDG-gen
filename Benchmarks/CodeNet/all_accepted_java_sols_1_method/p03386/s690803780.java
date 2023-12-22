import java.util.*;
 class Main{

     public static void main(String []args){
        
        Scanner scan = new Scanner(System.in) ;
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        int n =scan.nextInt();
        ArrayList<Integer> s = new ArrayList<>() ;
        for(int i = x ; i<x+n ; i++){
          if(!s.contains(i) && (i>=x && i<=y) ){
            s.add(i);   
          }
        }
        for(int i = y-n+1 ; i<=y ; i++){
          if(!s.contains(i) && (i>=x && i<=y)){
            s.add(i); 
          }
        }
       for(Integer k : s){
        System.out.println(k) ; 
       }
        
        
     }
}