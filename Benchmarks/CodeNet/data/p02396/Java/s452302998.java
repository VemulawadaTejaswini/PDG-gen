import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =1;
        int x = scanner.nextInt();          
        for(i=1;;i++){
                    if(x==0) break;
                    System.out.println("Case" +" "+ i + ":" + x);
                    x = scanner.nextInt();
                }
                }
}