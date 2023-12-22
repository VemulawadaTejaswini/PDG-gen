import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
 
    while(kbd.hasNext()){
        int m = kbd.nextInt();
        int f = kbd.nextInt();
        int r = kbd.nextInt();
 
        if(!(m==-1 && f==-1 && r==-1)){
        int p = m+f;
        if(m==-1 || f==-1) System.out.println("F");
        else if(p>=80) System.out.println("A");
        else if(p>=65 && p<80) System.out.println("B");
        else if(p>=50 && p<65) System.out.println("C");
        else if(p>=30 && p<50) {
            if(r>=50) System.out.println("C");
            else System.out.println("D");
        }
        else System.out.println("F");
        }
    }
    }
}