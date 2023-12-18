import java.util.*;

class Main{
	public static void main(String[] args){
     	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	String t = sc.next();
      	if(t.length()==s.length()+1){
         	if(t.substring(0,t.length()-1).equals(s)){
             System.out.println("Yes"); 
            }else{
				System.out.println("No");
            }
        }else{
         	System.out.println("No"); 
        }
    }
}