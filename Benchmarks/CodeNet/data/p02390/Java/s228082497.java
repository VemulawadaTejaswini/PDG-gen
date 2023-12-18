import java.util.Scanner;

public class Main{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        sc.close();
        System.out.println(S/3600+":"+S%3600/60+":"+S%3600%60);
    }
}
