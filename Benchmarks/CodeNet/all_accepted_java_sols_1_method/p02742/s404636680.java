import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long i, j;
		i = sc.nextLong();
		j = sc.nextLong();
		if (i ==1) {
			System.out.println(1);
		} else if (j ==1) {
			System.out.println(1);
		} else {
			System.out.println((i*j)/2+(j*i)%2);
		}
		
	}
}