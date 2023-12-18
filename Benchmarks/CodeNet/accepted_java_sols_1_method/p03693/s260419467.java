import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        byte r = scan.nextByte();
        byte g = scan.nextByte();
        byte b = scan.nextByte();
        if((r * 100 + g * 10 + b) % 4 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}