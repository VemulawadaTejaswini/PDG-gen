import java.util.Scanner;

class Main{
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int pages = scanner.nextInt();
        scanner.close();
        int result = pages%2 + pages/2;
        System.out.println(result);
    }
}