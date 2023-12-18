import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
    double a=Double.parseDouble(sc.next());
    double b=Double.parseDouble(sc.next());
    int c1=(int)(a/b);
    int c2=(int)(a%b);
    double c=a/b;
    System.out.println(c1+" "+c2+" "+c);
}
}
