import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x=Integer.parseInt(sc.next());
int y=Integer.parseInt(sc.next());
int s=Integer.parseInt(sc.next());
int max=0;
for(int i=1;i<s;i++){
max=Math.max((i/(100+x))*(100+y)+((s-i)/(100+x))*(100+y),max);
}
System.out.println(max);
}
}
