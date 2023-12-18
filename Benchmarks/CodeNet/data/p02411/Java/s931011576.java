import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(true){
int m=Integer.parseInt(sc.next());
int f=Integer.parseInt(sc.next());
int r=Integer.parseInt(sc.next());
int score=m+f;
if(score+r==-3)break;
    if(m==-1||f==-1){
    System.out.println("F");
    }else if(score>=80){System.out.println("A");}else if(score>=65&&score<80){System.out.println("B");}
    else if(score>=50&&score<65){System.out.println("C");}else if(score<30){System.out.println("F");}
    else if(r>=50){System.out.println("C");}else{System.out.println("D");}
}
}
}
