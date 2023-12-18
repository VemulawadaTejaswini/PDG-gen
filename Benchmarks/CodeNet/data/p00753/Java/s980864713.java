import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] v = new int[123456];
        for(int i = 0;i < 123456;i++){
            v[i] = 1;
        }
        int p = 3;
        while(true){
            if(p*p > 246912){
                break;
            }else{
                if(v[(p-1)/2] == 0){
                    p += 2;
                }else{
                    int t = p*p;
                    while(t < 246912){
                        v[(t-1)/2] = 0;
                        t += 2*p;
                    }
                    p += 2;
                }
            }
        }
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}else if(n == 1){
				System.out.println(1);
				continue;
			}
			int count = 0;
			int s = (n%2 == 0)?n/2:(n+1)/2;
			for(int i = s;i < n;i++){
				if(v[i] == 1){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}