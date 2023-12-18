import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
        	int a = input.nextInt();
        	int sum = 0;
        	for(int i = a ; i < 600 ; i+=a){
        		sum += Math.pow(i, 2)*a;
        	}
        	System.out.println(sum);
        }
    }    
}