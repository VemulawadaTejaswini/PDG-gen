import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[] d = new int[4001];
			boolean[] f = new boolean[4001];
			int[] log = new int[4000];
			for(int i=1;i<=n;i++){
				int num = stdIn.nextInt();
				if(log[num]==0){
					log[num] = i;
				}
				int single = stdIn.nextInt();
				int element = stdIn.nextInt();
				for(int j=0;j<element;j++){
					if(!f[num]){
						d[num] += single;
					}
					else{
						break;
					}
					if(d[num]>999999){
						f[num] = true;
						break;
					}
				}
			}
			boolean output = true;
			for(int i=1;i<=4000;i++){
				for(int j=0;j<4000;j++){
					if(log[j]==i){
						if(f[j]){
							System.out.println(j);
							output = false;
						}
						else{
							break;
						}
					}
				}
			}
			if(output){
				System.out.println("NA");
			}
		}
	}
}