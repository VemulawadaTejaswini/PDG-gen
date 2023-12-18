import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int n = scan.nextInt();
        	int sum = 2;
        	for(int i = 2;i <= n;i++){
        		sum += i;
        	}
        	System.out.println(sum);
        }
    }
}