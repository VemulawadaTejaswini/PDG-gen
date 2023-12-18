import java.util.Scanner;
  
public class Main{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  String a = sc.nextLine();
  String b = sc.nextLine();
  if(a.contains(b)) System.out.println(0);
   int count = 0;
  for(int i = 0;i<a.length();i++){
    String c = b.substring(0,b.length()-i);
    String d = b.substring(i,b.length());
    if(a.contains(c)) break; 
    if(a.contains(d)) break;
    count++;
  }
   System.out.println(count);
    
    
 }
}