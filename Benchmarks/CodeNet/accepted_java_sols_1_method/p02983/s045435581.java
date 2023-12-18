import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long res = 2020;
        if(b - a >= 2019){
            res = 0;
        }else{
            for(long i = a; i < b; i++){
                for(long j = a + 1; j <= b; j++){
                    res = Math.min(res, (i * j) % 2019);
                }
            }
        }
        System.out.println(res);
    }
}