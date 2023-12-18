 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 class Main  {
     public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         int x = scan.nextInt();
         String s[] = new String[x];
         for(int i=0;i<x;i++){
            s[i] = scan.next();  
         }
         int y = scan.nextInt();
         String s2[] = new String[y];
         for(int i=0;i<y;i++){
            s2[i] = scan.next();  
         } 
         ArrayList<Integer> a = new ArrayList<>();
         a.add(0);
         for(int i = 0 ; i<x ; i++){
             int yen = 0 ;
             for(int j=0; j<y ; j++){
                
                 if(s[i].equals(s2[j])){
                     yen--;
                 }
             } for(int j=0; j<x ; j++){
                
                 if(s[i].equals(s [j])){
                     yen++;
                 }
             }
             //System.out.println(yen);
             a.add(yen);
                     
         }
         System.out.println(Collections.max(a,null));
     }
}