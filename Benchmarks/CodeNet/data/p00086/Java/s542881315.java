import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] route;
		while(scan.hasNext()){
			route = new int[101];
			for(;;){
				int a = scan.nextInt();
				int b = scan.nextInt();
				if(a == 0 && b == 0){
					break;
				}
				route[a-1]++;
				route[b-1]++;
			}
			boolean sw = true;
			int count = 0;
			for(int i = 0;i < 101;i++){
				if(route[i] == 0){
					continue;
				}
				if(route[i]%2 != 0){
					if(sw){
						sw = false;
					}else{
						sw = true;
						count++;
					}
				}
				if(count > 1){
					sw = false;
					break;
				}
			}
			if(sw){
				System.out.println("OK");
			}else{
				System.out.println("NG");
			}
		}
	}
}