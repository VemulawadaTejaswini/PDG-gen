import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int H=Integer.parseInt(sc.next());
int W=Integer.parseInt(sc.next());
char[][] c=new char[H][W];
for(int i=0;i<H;i++){
String s=sc.next();
    for(int j=0;j<W;j++){
    c[i][j]=s.charAt(j);
    }
}
for(int i=0;i<2*H;i++){
    for(int j=0;j<W;j++){
    System.out.print(c[i/2][j]);
    }System.out.println();
}

}}