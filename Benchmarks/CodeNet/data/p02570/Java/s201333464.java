import java.util.*;
class Main{
public static void main(String []args){
Scanner sr = new Scanner(System.in);
int d = sr.nextInt();
int t = sr.nextInt();
int s = sr.nextInt();
if(d/s <= t)
System.out.print("Yes");
else
System.out.print("No");
}
}