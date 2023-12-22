import java.util.Scanner;


public class Main{
	public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
	// 整数の入力
	int a = sc.nextInt();
	int b = sc.nextInt();
	int t = sc.nextInt();
	
	double byou = t + 0.5; 
	double byou1 = byou/a;
        int byou2 = (int)byou1;
        
	

	int answer = byou2*b; 

	System.out.println(answer);
}

	

}