import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while (true){
	int a = sc.nextInt();
	int b = sc.nextInt();
	int i,j;
	if (a==0 && b==0){
		break;
		}
	for(i=0;i<a; i++){
		for(j=0;j<b;j++){
			System.out.printf("#");
			}
		System.out.printf("\n");	
	}
	System.out.printf("\n");
	}
}
}