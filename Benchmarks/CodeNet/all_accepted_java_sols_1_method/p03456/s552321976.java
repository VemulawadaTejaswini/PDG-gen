import java.util.*;

public class Main{
public static void main(String... args){
Scanner sc = new Scanner(System.in);
String a=sc.next();
String b=sc.next();
int ab=Integer.parseInt(a+b);
for(int i=1;i<=Math.sqrt(100100);i++){
if(i*i==ab){
System.out.println("Yes");return;
}
}
System.out.println("No");
}
}