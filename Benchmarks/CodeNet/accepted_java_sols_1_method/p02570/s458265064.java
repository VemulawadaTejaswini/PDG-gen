import java.util.*;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        double d = sc.nextInt();
        double t = sc.nextInt();
        double s = sc.nextInt();
        
        double time = d / s;
        
        if (time <= t) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
        