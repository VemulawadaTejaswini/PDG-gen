import java.util.Scanner;
public class Main {
       public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int  w= sc.nextInt();
int  h= sc.nextInt();
int  x= sc.nextInt();
int  y= sc.nextInt();
int  r= sc.nextInt();

if(x-r>0 || x+r<w){
syste.out.println("Yes");
}else if(x-r<=0 && x+r>=w){
system.out.println("No");
}

return 0;
}
