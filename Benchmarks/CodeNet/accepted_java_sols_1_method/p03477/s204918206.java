import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weit1=sc.nextInt();
        int weit2=sc.nextInt();
        int weit3=sc.nextInt();
        int weit4=sc.nextInt();
        
        if(weit1+weit2==weit3+weit4)
            System.out.println("Balanced");
        else if(weit1+weit2>weit3+weit4)
            System.out.println("Left");
        else if(weit1+weit2<weit3+weit4)
            System.out.println("Right");
         
    }
}