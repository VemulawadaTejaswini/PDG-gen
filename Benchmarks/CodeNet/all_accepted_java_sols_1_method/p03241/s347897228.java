import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int div = m/n;
		
		while(true){
			if(m%div==0){
				System.out.println(div);
				break;
			}
			else
				div--;
		}
	}
}
