import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() { 
		int a[] = new int [5];
		for(int i = 0;i < 5;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i = 4;i >= 0;i--){
			System.out.print(a[i]+" ");
		}
		System.out.println();
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}