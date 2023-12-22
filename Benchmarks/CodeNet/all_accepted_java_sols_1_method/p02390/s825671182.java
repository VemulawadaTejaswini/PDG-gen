import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int h,m,s;

        h = num/3600;
        m = num%3600;
        s = m%60;
        m = m/60;

        System.out.println(h + ":" + m + ":" + s);
    }
}
