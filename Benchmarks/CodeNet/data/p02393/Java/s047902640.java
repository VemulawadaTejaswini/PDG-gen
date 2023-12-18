import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int[] number = new int[3];
	number[0] = a;
	number[1] = b;
	number[2] = c;
	int max = 0;
	int middle = 0;
	int min = 10000;

	if(1<=a && a<= 10000 && 1<=b && b<=10000 && 1<= c && c<=10000){
		for(int n : number){
			if(max < n){
				middle = max;
				max = n;
			}else if(min > n){
				middle = min;
				min = n;
			}else{
				middle = n;
			}
		}
	}
	System.out.println(min + " " + middle + " " + max);
	sc.close();
}
}