java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int r=s.nextInt();
int d=s.nextInt();
System.out.println(Math.floor(l/d)-Math.floor(r/d));
}
}