import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = a / 500;
        int c = a % 500 / 5;
        System.out.println(b * 1000 + c * 5);
    }
}