import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(y / 2 * 2 != y){
            System.out.println("No");
        }else if(y / 2 < x){
            System.out.println("No");
        }else if(4 * x < y){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        sc.close();
    }
}