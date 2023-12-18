import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h = S/3600;
        int min = (S-h*3600)/60;
        int sec = S-h*3600-min*60;
        System.out.println(h +":"+ min +":"+ sec);
    }    
}
