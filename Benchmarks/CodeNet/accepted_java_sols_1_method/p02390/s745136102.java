import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        System.out.println(x/3600+":"+(x/60)%60+":"+x%60);
    }
}
