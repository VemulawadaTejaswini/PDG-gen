import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int x=sc.nextInt();
			if(n==0){
				break;
			}
			System.out.println(result(n,x));
		}
	}

	public static int result(int n, int x){
		int count=0;
		for(int i=1; i<=n; i++){
			for(int j=i+1; j<=n; j++){
				for(int k=j+1; k<=n; k++){
					if((i+j+k)==x){
						count++;
					}
				}
			}
		}
		return count;
	}


}
