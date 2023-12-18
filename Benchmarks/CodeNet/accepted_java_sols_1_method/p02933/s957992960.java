import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        while(tan.hasNext()){
            int a=tan.nextInt();
            String st=tan.next();
            if(a<3200)
                System.out.println("red");
            else
                System.out.println(st);
        }
    }
}
