import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		int[] place=new int[m];
		for(int i=0;i<m;i++){
			place[i]=scan.nextInt();
		}
		int num1=0;
		for(int i=0;i<m;i++){
			if(place[i]<x){
				num1++;
			}
		}
		int num2=0;
		for(int i=0;i<m;i++){
			if(place[i]>x){
				num2++;
			}
		}
		if(num1<num2){
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
}
