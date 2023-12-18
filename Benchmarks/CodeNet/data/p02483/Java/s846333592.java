import java.util.Scanner;
import java.util.*;
 class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[] num =new int[3];
		for(int i=0;i<3;i++){
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		for(int i=0;i<3;i++){
			if(i==2){
				System.out.println(num[i]);
			}
			else{
				System.out.print(num[i]+" ");
			}
		}
	}
 }