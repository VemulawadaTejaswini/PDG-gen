import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] v = new int[25000];
        for(int i = 0;i < 25000;i++){
            v[i] = 1;
        }
        int p = 3;
        while(true){
            if(p*p > 50000){
                break;
            }else{
                if(v[(p-1)/2] == 0){
                    p += 2;
                }else{
                    int t = p*p;
                    while(t < 50000){
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
			}
			int count = 0;
			int a = 0;
			int b = 0;
			for(int i = 0;i < n/2;i++){
				for(int j = i;j < n/2;j++){
					a = (i==0)?2:(2*i+1);
					b = (j==0)?2:(2*i+1);
					if(a+b == n){
						count += (i==j)?2:1;
					}
				}
			}
			System.out.println(count/2);
		}
	}
}