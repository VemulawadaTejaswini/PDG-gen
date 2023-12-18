import java.util.*;

public class Program{
public void run(){
Scanner sc = new Scanner(System.in);
int x =sc.nextInt();
int y=1;
for(int i=0; i<3; i++) y *=x;
System.out.println(y);
}
public static void main(String[] args){
 Program p = new Program();
 p.run();
}
}