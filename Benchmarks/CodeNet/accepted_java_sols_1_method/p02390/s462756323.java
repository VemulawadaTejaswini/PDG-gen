import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 3600;
        int c = (a-b*3600) / 60;
        int d = a-b*3600-c*60;
        System.out.println(b+":"+c+":"+d);
    }
}
