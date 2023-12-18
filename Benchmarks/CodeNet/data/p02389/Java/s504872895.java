import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.print(a*b+" ");
            System.out.println(2*(a+b));
            scanner.close();
        }catch(NumberFormatException e){
            System.out.println(e);
        }finally{
            scanner.close();
        }
        }
    }
