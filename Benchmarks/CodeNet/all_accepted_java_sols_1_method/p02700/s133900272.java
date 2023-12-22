import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float hp = sc.nextInt();
        float at = sc.nextInt();
        float hp2 = sc.nextInt();
        float at2 = sc.nextInt();
        if(Math.ceil(hp/at2) >= Math.ceil(hp2/at)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}