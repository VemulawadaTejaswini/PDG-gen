import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int count=0;

		for(int i=1;i<=n;i++){
			if(i<=9){
				count++;
			}else if(i>=100 && i<=999){
				count++;
			}else if(i>=10000 && i<=99999){
				count++;
			}
		}

		System.out.println(count);


	}
}
