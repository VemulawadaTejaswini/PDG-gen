import java.util.*;

public class Main {
    public static void main(String[] args){
  
  Scanner sc=new Scanner(System.in);
  while(true){
  int m= sc.nextInt();
  int n= sc.nextInt(); 
  int r= sc.nextInt();
  if(m==-1&&n==-1&&r==-1) break;
  
  if(m==-1||n==-1){
     System.out.println("F");
      
  }
     else if(m+n>=80){
         System.out.println("A");
     }
     else if(m+n>=65&&m+n<80){
         System.out.println("B");
     }
     else if(m+n>=50&&m+n<65){
         System.out.println("C");
     }
     else if(m+n>=30&&m+n<50){
         if(r>=50){
             System.out.println("C");
         }else{
             System.out.println("D");
             
         }
         
     }
  else if(m+n<30){
       System.out.println("F");
  }
  
 }
}}
