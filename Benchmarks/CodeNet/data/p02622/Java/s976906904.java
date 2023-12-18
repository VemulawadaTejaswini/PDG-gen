import java.util.Scanner;


class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   String s = sc.next();
   String t = sc.next();
   int count=0;
   
   for(int i=0;i<s.length();i++){
    if((s.charAt(i))==(t.chatAt(i))){
   count++;
    }
   }

   
     System.out.println(count);
   
 
 }
}
