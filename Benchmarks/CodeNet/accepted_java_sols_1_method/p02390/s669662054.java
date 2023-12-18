import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int s=Integer.parseInt(sc.next());
int h=s/(3600);
int m=(s-3600*h)/60;
s=s-3600*h-60*m;
System.out.println(h+":"+m+":"+s);
}
}
