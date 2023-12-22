import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        
        System.out.println((X/500) *1000 + (X%500) /5 *5);



        
        }
	}
