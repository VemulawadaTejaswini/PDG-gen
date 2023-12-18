import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        if(a + b < 10){
            System.out.println(a + b);
        }else{
            System.out.println("error");
        }
    }

}
