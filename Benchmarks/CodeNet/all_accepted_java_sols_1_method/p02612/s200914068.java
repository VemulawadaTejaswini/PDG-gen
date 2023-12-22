import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int s = 0;
        for(int i=1000;  s<a; i+=1000){
             s = i;
        }
        System.out.println(s-a);
    }
}