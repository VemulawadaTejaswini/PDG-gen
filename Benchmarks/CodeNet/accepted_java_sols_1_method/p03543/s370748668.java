import java.util.*;
class Main{
	
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
    	String a=sc.next();
    	System.out.println(a.charAt(1)!=a.charAt(2)?"No":a.charAt(1)==a.charAt(0)||a.charAt(1)==a.charAt(3)?"Yes":"No");
    }
}