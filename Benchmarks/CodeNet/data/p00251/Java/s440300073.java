import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int sum = 0;
        	for(int i = 0;i < 10;i++){
        		sum += scan.nextInt();
        	}
        	System.out.println();
        }
    }
}