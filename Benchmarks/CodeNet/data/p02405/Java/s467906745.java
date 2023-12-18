import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
 
    while(kbd.hasNext()){
        int h = kbd.nextInt();
        int w = kbd.nextInt();
        if(!(h==0 && w==0)){
        for(int i=1; i<=h; i++){
            for(int j=1; j<=w; j++){
            if(c(i,j))System.out.print("#");
            else System.out.print(".");
            }
            System.out.println();
        }
        System.out.println();
        }
    }
    }
 
    static boolean c(int i, int j){
    boolean a = i%2==1;
    boolean b = j%2==1;
    if(a==true && b==true) return true;
    if(a==false && b==true) return false;
    if(a==true && b==false) return false;
    return true;
    }
}