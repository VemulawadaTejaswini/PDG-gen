import java.util.*;
public class Main {

	public static void main(String[] args) {
		int n, x, count = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			x = sc.nextInt();
			if(n == 0 && x == 0)
				break;
		for(int i = 0; i < n; i ++){
			for(int j = 0; j < n; j ++){
				for(int k = 0; k < n; k ++){
					if(i + j + k == x)
						flag = true;
					if(i == j || j == k|| k == i)
						flag = false;
				}
				if(flag)
					count++;
				flag = false;
			}
		}
		System.out.println(count);
		count = 0;
		}
	}
}