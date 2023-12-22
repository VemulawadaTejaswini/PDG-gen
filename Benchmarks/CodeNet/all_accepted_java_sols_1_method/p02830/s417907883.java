import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        String c = sc.next();
        String[] d=b.split("");
        String[] e =c.split("");
        for(int i=0;i<a;i++){
            System.out.print(d[i]+e[i]);
        }
    }
}