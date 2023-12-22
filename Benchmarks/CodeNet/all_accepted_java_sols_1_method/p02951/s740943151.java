import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        int a = yomi.nextInt();
        int b = yomi.nextInt();
        int c = yomi.nextInt();
        int d = a-b;
        if (d>=c){
            System.out.println(0);
            }else System.out.println(c-d);
        }

    }