import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int h = x / (60 * 60);
        int m = (x - h*60*60) / 60;
        int s = (x - h*60*60 - m*60);

        System.out.println(h + ":" + m + ":" + s);
    }
}

