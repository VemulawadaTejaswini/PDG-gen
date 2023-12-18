import java.util.Scanner;
public class Main{
public static void main(String[] args){
    
    Scanner s=new Scanner(System.in);
    
    String a=s.nextLine();
    String b=a+a;
    String c=s.nextLine();
    if(b.contains(c))
        System.out.println("Yes");
    else
        System.out.println("No");
    s.close();
}
}
