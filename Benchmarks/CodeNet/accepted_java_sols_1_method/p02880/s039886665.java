import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        for(i = 1; i <= a; i++){
            if(a % i == 0){
                for(int j = i; j <= a; j++){
                    if((i * j == a) && i>=1 && i <=9 && j>=1 && j <=9){
                        System.out.println("Yes");
                        System.exit(0);
                    }
                }
            }
        }
        if(i == a + 1){
            System.out.println("No");
        }
    }
}