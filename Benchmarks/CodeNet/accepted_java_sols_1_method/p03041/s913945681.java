import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int length1 = sc.nextInt();
   int b = sc.nextInt();
   String ccc = sc.next();
   
if(b ==1){
 String c1 = ccc.substring(0,1);
 String c2 = ccc.substring(1,length1);
  
  String cs = c1.toLowerCase();
  String cans1 = cs+c2;
  
  System.out.println(cans1);
}
   
else  if(b == length1){
 String c1 = ccc.substring(0,b-1);
 String c2 = ccc.substring(b-1,b);
  
  String cs = c2.toLowerCase();
  
  String cans2 = c1+cs;
  
  System.out.println(cans2);
}
   
 else{
  String c1 = ccc.substring(0,b-1);
 String c2 = ccc.substring(b-1,b);
  String c3 = ccc.substring(b,length1);
  
  String cs = c2.toLowerCase();
  
  String cans3 = c1+cs+c3;
  
  System.out.println(cans3);
}  
   
 }
}