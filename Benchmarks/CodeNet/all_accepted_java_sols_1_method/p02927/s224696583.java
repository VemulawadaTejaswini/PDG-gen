import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for(int i = 2; i <= a; i++){
            for(int j = 20; j <= b; j++){
                if((j % 10) >= 2 && (j / 10) >= 2){
                    if((j / 10) * (j % 10) == i){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
