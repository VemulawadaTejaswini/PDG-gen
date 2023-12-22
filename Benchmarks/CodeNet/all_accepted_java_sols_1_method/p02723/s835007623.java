import java.util.*; 
public class Main{
public static void main(String ... string){
  Scanner sc = new Scanner(System.in); 
  String s = sc.nextLine(); 
  if(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)){
   System.out.println("Yes"); 
  }
  else System.out.println("No"); 
}

}