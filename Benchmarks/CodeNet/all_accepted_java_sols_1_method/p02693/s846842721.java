import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a ; i<=b ; i++){
            if(i % k == 0){
                System.out.println("OK");
                System.exit(0);
            }
        }
        System.out.println("NG");
        System.exit(0);

    }
}