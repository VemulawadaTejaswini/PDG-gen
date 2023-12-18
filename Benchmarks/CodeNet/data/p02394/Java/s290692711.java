import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int W=Integer.parseInt(sc.next());
int H=Integer.parseInt(sc.next());
int r=Integer.parseInt(sc.next());
int x=Integer.parseInt(sc.next());
int y=Integer.parseInt(sc.next());
if((r<x&&x<W-r)&&(r<y&&y<H-r)){System.out.println("Yes");}else{System.out.println("No");}
}
}
