import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] v = new int[25025];
		for(int i = 0;i < 25025;i++){
			v[i] = 1;
		}
		int p = 3;
		while(true){
			if(p*p > 50050){
				break;
			}else{
				if(v[(p-1)/2] == 0){
					p += 2;
				}else{
					int t = p*p;
					while(t < 50050){
						v[(t-1)/2] = 0;
						t += 2*p;
					}
					p += 2;
				}
			}
		}
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 3){
				System.out.println(2 + " " + 5);
				continue;
			}
			int prev = 0;
			boolean sw = false;
			for(int i = 1;i < 25025;i++){
				if(v[i] != 1){
					continue;
				}
				if((2*i + 1) == n && !sw){
					sw = true;
					continue;
				}
				if(sw || (2*i + 1) > n){
					System.out.println(2*prev+1 + " " + (2*i+1));
					break;
				}
				prev = i;
			}
		}
	}
}