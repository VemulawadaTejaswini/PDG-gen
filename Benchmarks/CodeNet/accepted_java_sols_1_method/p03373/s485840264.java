import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int amount = 0;

        if(x <= y){
            for(int i = 0; i <= y; i++){
                int tmp = b * i + 2 * c * (y - i) + Math.min(a, 2 * c) * Math.max(0, x - y + i);
                if(amount == 0){
                    amount = tmp;
                }else{
                    amount = Math.min(amount, tmp);
                }
            }
        }else{
            for(int i = 0; i <= x; i++){
                int tmp = a * i + 2 * c * (x - i) + Math.min(b, 2 * c) * Math.max(0, y - x + i);
                if(amount == 0){
                    amount = tmp;
                }else{
                    amount = Math.min(amount, tmp);
                }
            }
        } 

        System.out.println(amount);
	}
}