import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int length_chair=scan.nextInt();
        int length_sit=scan.nextInt();
        int pitch=scan.nextInt();
        System.out.println((length_chair-pitch)/(length_sit+pitch));

    }
}
