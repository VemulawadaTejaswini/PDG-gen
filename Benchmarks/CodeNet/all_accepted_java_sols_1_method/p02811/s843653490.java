import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int x = scan.nextInt();

        scan.close();

        if(k * 500 >= x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
