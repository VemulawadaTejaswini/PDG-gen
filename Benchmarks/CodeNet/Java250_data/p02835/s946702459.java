import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int sum = 0;
	int[] k = new int[3];
	for(int i = 0;i < 3;i++){
	    k[i] = scanner.nextInt();
	    sum += k[i];
	}
	if(sum > 21)
	    System.out.println("bust");
	else
	    System.out.println("win");
    }
}
