import java.util.Scanner;
class Main
public void main(String arg[]){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

if(a<b){
System.out.println(a+"<"+b);
}
if(a>b){
System.out.println(a+">"+b);
}else if(a==b){
System.out.println(a+"=="+b);
}

}