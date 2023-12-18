import java.util.Scanner;
class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int a = (int)(X/100);
        int b = X-a*100;
        if (b > a*5) {
        		System.out.println(0); 
        } else {
        		System.out.println(1);
        }
    }
} 