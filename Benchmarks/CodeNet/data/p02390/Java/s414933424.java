import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //String[] num = str.split(" ",0);
        int s,a,b,c;
        /*
        a = Integer.valueOf(num[0]);
        b = Integer.valueOf(num[1]);
        */
        s = Integer.valueOf(str);
        a = s / 3600;
        s =s % 3600;
        b = s / 60;
        c = s % 60;
        System.out.println(a+":"+b+":"+c);
        scan.close();
    }
}
