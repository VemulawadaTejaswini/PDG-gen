import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        long h1 = h / 2;
        long h2 = h % 2;
        if(h == 1 || w == 1){
            System.out.println(1);
        }else if(h2 == 0){
            System.out.println(h1 * w);
        }else{
            System.out.println(h1 * w + w / 2 + w % 2);
        }
    }
}