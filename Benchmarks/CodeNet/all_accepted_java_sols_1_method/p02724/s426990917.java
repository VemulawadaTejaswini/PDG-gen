
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int count=  x%500;
        int hp=(x/500)*1000;
        hp+=(count/5)*5; 
        System.out.println(hp);
    }
    }
