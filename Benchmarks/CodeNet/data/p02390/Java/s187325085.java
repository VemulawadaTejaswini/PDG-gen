import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int h = sum/3600;
        int m = (sum%3600)/60;
        int s = ((sum%3600)%60);
        System.out.println(h+":"+m+":"+s);
    }
}
