import java.util.Scanner; 
public class Main { 
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in); 
while (sc.hasNextLine()){
    long n=sc.nextLong();
    long m=sc.nextLong();
    String s=Long.toString(n+m);
    System.out.println(s.length());
}

 } }
