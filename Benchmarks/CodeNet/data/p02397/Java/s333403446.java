import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(true){
    int x=Integer.parseInt(sc.next());
    int y=Integer.parseInt(sc.next());
    if(x<=y)System.out.println(x+" "+y);
    if(y<x)System.out.println(y+" "+x);
    if(x==0&&y==0)break;
            }
}
}
