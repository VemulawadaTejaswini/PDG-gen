import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        int hour = S / 3600;
        int minutes = (S % 3600) / 60;
        int seconds = (S % 3600)  % 60;
        System.out.println(hour+":"+minutes+":"+seconds);
    }
}
