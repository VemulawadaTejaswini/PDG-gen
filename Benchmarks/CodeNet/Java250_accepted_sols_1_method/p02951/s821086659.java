
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        byte a=stdIn.nextByte();
        byte b=stdIn.nextByte();
        byte c=stdIn.nextByte();
        c-=a-b;
        if(c>0){
            System.out.println(c);
        }
        else System.out.println(0);
    }
}