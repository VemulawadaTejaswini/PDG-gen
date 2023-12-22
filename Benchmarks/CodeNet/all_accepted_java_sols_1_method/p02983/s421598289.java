import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int min = (L%2019)*(R%2019)%2019;
		if (R-L > 2019){
		    System.out.println(0);
		    return;
		}
		for(int i=L;i<R;i++){
		    for(int j=i+1;j<=R;j++){
		        if((i%2019)*(j%2019)%2019 < min){
		            min = (i%2019)*(j%2019)%2019;
		        }
		    }
		}
		System.out.println(min);
	}
}