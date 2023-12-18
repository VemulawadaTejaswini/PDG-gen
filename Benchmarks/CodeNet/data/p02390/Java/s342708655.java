import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int s=Integer.parseInt(sc.next());
int h=s/(3600);
int m=s/60;
System.out.println(h+":"+m+":"+s);
}
}
