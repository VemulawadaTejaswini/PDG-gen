import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int h, m, s;
        
        h = time / 3600;
        m = (time%3600) / 60;
        s = time % 60;
        System.out.println(h + ":" + m +":" + s);
    }
}
