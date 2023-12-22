import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
      String s1 = "ABC";
      String s2 = "ARC";
      boolean t1 = true;
      boolean t2 = true;
		for(int i = 0;i<s.length();i++){
         if(s.charAt(i)!=s1.charAt(i)){
            t1 = false;
            break;
         }
      }
      	for(int i = 0;i<s.length();i++){
         if(s.charAt(i)!=s2.charAt(i)){
            t2 = false;
            break;
         }
      }
       if(t1==true){
          System.out.println(s2);
           }
       if(t2==true){
          System.out.println(s1); 
          }
	}
}
