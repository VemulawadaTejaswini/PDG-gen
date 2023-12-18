import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0 ; i < n ; i++){
			int a[] = new int[10];
			boolean used[] = new boolean[10];
			for(int j = 0 ; j < 10 ; j++){
				a[j] = input.nextInt();
			}
			
			int nownum = 0;
			for(int j = 0 ; j < 10 ; j++){
				if(!used[j] && nownum < a[j]){
					used[j] = true;
					nownum = a[j];
				}
			}
			
			nownum = 0;
			for(int j = 0 ; j < 10 ; j++){
				if(!used[j] && nownum < a[j]){
					used[j] = true;
					nownum = a[j];
				}
			}
			boolean isok = true;
			for(int j = 0 ; j < 10 ; j++){
				if(!used[j]){
					isok = false;
					break;
				}
			}
			if(isok){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}
		input.close();
	}
}