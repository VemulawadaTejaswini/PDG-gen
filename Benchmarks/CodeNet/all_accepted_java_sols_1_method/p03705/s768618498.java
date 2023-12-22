import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();

        if(a > b){ 
            System.out.print("0");
            return;
        }

        if(n==1){
            if(a != b){
                System.out.print("0");
                return;
            }else{
                
            }
        }

        System.out.print((n-1)*b + a - (n-1)*a - b + 1);
    }
}