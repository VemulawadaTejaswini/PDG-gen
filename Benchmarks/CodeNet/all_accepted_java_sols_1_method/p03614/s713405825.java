import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		
		int cnt=0;
		boolean flg=false; 
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			if(a[i]==i+1){
				if(flg){
					flg=false;
				}else{
					flg=true;
					cnt++;
				}
			}else{
				flg=false;
			}
		}
		
		System.out.print(cnt);

	}

}
