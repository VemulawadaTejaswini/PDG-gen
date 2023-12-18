import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n[]=new int[10];
		for(int i=0;i<10;i++){
			n[i]=scanner.nextInt();
		}
		Arrays.sort(n);
		for(int i=9;i>=7;i--){
			System.out.printf("%d\n", n[i]);
		}
	}

}