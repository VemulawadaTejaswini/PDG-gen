import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int []a = new int[num];
		
		long min, max, sum;
		
		for(int i=0; i<num; i++){
			a[i] = sc.nextInt(); 
		}
		min = a[0];
		for(int i=0; i<num; i++){
			if(a[i] < min){
				min = a[i];
			}
		}
		max = a[0];
		for(int i=0; i<num; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		sum = 0;
		for(int i=0; i<num; i++){
			sum += a[i];
		}
		System.out.println(min + " " + max + " " + num);
		sc.close();
	}
}
