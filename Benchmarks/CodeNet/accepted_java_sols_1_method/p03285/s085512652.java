import java.util.*;
public class Main {
	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
				
		boolean flag = false;
		for(int i = 0;i<=a;i = i+4){
			for(int j = 0;j<=a;j = j+7){
				if(i+j == a){
					flag = true;
				}
			}
		}
		
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}