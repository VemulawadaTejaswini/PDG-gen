import java.util.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int count = 0;

        for(int i = num1;i <= num2;i++){
            if(num3 % i == 0)   count++;
        }

        System.out.println(count);
    }
}
