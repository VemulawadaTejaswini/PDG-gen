import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        while(sc.hasNextDouble()){
        	
            float a = sc.nextFloat();
            float sum = a;
            
            for(int i = 0; i < 4; i++){
                a *= 2;
                sum += a;
                a /= 3;
                sum += a;
            }
            a *= 2;
            sum += a;
            System.out.println(sum);
        }
    }
}