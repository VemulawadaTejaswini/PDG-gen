import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String X = sc.next();
    String Y = sc.next();
    char[]a = X.toCharArray();
    char[]b = Y.toCharArray();
    

    if(a[0]-55 == b[0]-55){
	System.out.println("=");
    }else if(a[0]-55 > b[0]-55){
	System.out.println(">"); 
    }else{
    System.out.println("<");     
    }
    }
}