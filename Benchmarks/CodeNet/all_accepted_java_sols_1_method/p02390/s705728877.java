import java.util.Scanner;
  
public class Main { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();                                             
        int h = x/3600;
        int m = (x%3600)/60;
        int s = ((x%3600)%60)%60;
  
        System.out.println(h+":"+m+":"+s);
    }
}