import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int h,m,s,sec;
        sec=in.nextInt();
        h=sec/3600;
        m=(sec%3600)/60;
        s=((sec%3600)%60);
        System.out.println(h+":"+m+":"+s);
    }
}
