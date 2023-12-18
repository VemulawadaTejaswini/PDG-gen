import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = 2*b;
if(c>a){
System.out.println(0);
}
else{
System.out.println(a-c);
}
}
}