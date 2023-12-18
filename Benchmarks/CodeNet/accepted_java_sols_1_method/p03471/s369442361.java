import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		boolean flag = false;
		for(int i = 0; i <= N; i++){
			if(flag == true)break;
			for(int j = 0; j <= N-i; j++){
				if(flag == true)break;
				if(i * 10000 + j * 5000 + (N-i-j)*1000 == Y){
					System.out.println(i + " " + j + " " + (N-i-j));
					flag = true;
				}
			}
		}
		if(flag == false)System.out.println("-1 -1 -1");
	
	
	
	}



}



