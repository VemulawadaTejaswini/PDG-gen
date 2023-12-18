import java.util.*;

class Main{           
  
   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);  
         
         HashSet<Character> left = new HashSet<Character>();
         HashSet<Character> right = new HashSet<Character>();
         
         left.add('q');
         left.add('w');
         left.add('e');         
         left.add('r');         
         left.add('t');                  
         left.add('a');                           
         left.add('s');                                    
         left.add('d');                                             
         left.add('f');                                                      
         left.add('g');                                                               
         left.add('z');                                                                        
         left.add('x');                                                                                 
         left.add('c');                                                                                          
         left.add('v');                                                                                                   
         left.add('b');                                                                                                                     
         right.add('y');
         right.add('u');
         right.add('i');         
         right.add('o');                  
         right.add('p');                           
         right.add('h');                                    
         right.add('j');                                             
         right.add('k');                                                      
         right.add('l');                                                               
         right.add('n');                                                                        
         right.add('m');                                                                                 
         
         while(true){
             
             String n = sc.next();
             
             if(n.equals("#")){
                 break;
             }else{
                 boolean leftflag = false;
                 boolean rightflag = false;
                 int count = 0;
                 for(int i = 0;i < n.length();i++){
                     char a = n.charAt(i);
                     if(!leftflag && left.contains(a)){
                         rightflag = false;
                         count++;
                         leftflag = true;
                     }else if(!rightflag && right.contains(a)){
                         leftflag = false;
                         count++;
                         rightflag = true;
                     }                     
                 }    
                 System.out.println(count-1);
             }
             
         }
                 
   }         
         
 }
  