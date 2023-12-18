import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int r=s.nextInt();
int d=s.nextInt();
System.out.println((int)(Math.floor(r/d)-Math.floor(l/d)));
}
}