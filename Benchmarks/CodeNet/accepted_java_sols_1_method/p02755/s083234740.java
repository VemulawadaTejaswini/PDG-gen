import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a * 100 / 8, t = b * 10;
        if((double)a * 100 / 8 % 1 > 0) s++;
        if(s >= t && (s / 10) == b){
            System.out.println(s);
        }else if(t >= s && (t * 8 /100) == a){
            System.out.println(t);
        }else{
            System.out.println(-1);
        }
    }
}
