import java.util.Scanner;

public class Main {
    public void Solution(int n){
        if (n>=400 && n<600)
            System.out.println(8);
        if (n>=600 && n<800)
            System.out.println(7);
        if (n>=800 && n<1000)
            System.out.println(6);
        if (n>=1000 && n<1200)
            System.out.println(5);
        if (n>=1200 && n<1400)
            System.out.println(4);
        if (n>=1400 && n<1600)
            System.out.println(3);
        if (n>=1600 && n<1800)
            System.out.println(2);
        if (n>=1800 && n<2000)
            System.out.println(1);
    }

    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        Main obj=new Main();
        while (true){
            int n=tan.nextInt();
            obj.Solution(n);
        }
    }
}
