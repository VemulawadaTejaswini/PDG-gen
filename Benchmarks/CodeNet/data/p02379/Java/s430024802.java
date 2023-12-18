
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x1,x2,y1,y2;
x1 =sc.nextInt();
y1 =sc.nextInt();
x2 =sc.nextInt();
y2 =sc.nextInt();
System.out.println(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
}
}