 
 
import java.util.ArrayList;
import java.util.Scanner;

  class Main  {
     public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         String s = scan.next ();
         int max = 0 ;int count1 = 0 , count2 = 0;
         ArrayList<Character> a1 = new ArrayList<>();
         
         ArrayList<Character> a2 = new ArrayList<>();
         for(int i = 1 ; i<s.length();i++){
             String s1 = s.substring(0,i);
             String s2 = s.substring(i,n ); 
              for(int j = 0 ; j <s1.length();j++){     
                a1.add(s1.charAt(j));
                 //System.out.println(count);
             }
              for(int j = 0 ; j <s2.length();j++){     
                a2.add(s2.charAt(j));
                 //System.out.println(count);
             }
             
             for(int j = 0 ; j <s1.length();j++){     
                 if(s1.indexOf(s1.charAt(j) ) == j && a2.contains(s1.charAt(j))){
                  count1++; 
                }
                 //System.out.println(count);
             }
             
             for(int j = 0 ; j <s2.length();j++){
                 if(s2.indexOf(s2.charAt(j) ) == j && a1.contains(s2.charAt(j))){
                  count2 ++; 
                }
                 
                 //System.out.println(count);
             }
           
            // System.out.println(i +"th loop :"+count1); 
            //op :"+count2);
             if(count1 == count2 && count1>max) max = count1 ;
             count1 = 0 ;
             count2 = 0 ;
             //System.out.println("max:" +max);
             a1.clear();
             a2.clear();
         }         
         System.out.println(max);
     }
}
