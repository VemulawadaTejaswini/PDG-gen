import java.util.*;  
class Al
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter an alphabet ");  
char c= sc.next().charAt(0);  
  System.out.println("entered alphabet is "+c);
  if (c >= 'A' && c <= 'Z')  
            System.out.println("\nA");  
      
        else if (c >= 'a' && c <= 'z')  
            System.out.println(" a" );
}
}