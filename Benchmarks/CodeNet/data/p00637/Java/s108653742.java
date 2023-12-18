

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int z = 0;
		int i = 0;
		for(int kk=0;kk<1000000;kk++){
			int n = sc.nextInt();
			if(n==0){
				System.exit(0);
			}else{
				int a[] = new int[n]; 
				a[0]= sc.nextInt();
				for(i=1;i<n;i++){
					a[i] = sc.nextInt();
					if((a[i-1]+1)==a[i]){
					}else{
						System.out.println(a[z]+"-"+a[i-1]);
							z=i;
					}
				}
				System.out.println(a[z]+"-"+a[i-1]);
				z=0;
			}
		}
	}

}