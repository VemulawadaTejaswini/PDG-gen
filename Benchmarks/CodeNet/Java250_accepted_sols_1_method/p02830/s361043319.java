import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String a=sc.next();
String b=sc.next();
String z="";
for(int i=0;i<n;i++)
{
z=z+a.charAt(i)+b.charAt(i);
}
System.out.println(z);


}
}

