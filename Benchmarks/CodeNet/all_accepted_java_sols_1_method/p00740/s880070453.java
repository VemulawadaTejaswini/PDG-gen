import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			int p = stdIn.nextInt();
			if((n|p)==0){
				return;
			}
			int[] a = new int[n];
			int i = 0;
			while(true){
				if(p>0){
					p--;
					a[i]++;
					if(p==0){
						boolean flag = true;
						for(int j=0;j<n;j++){
							if(i!=j&&a[j]>0){
								flag = false;
								break;
							}
						}
						if(flag){
							break;
						}
					}
				}
				else{
					p = a[i];
					a[i] = 0;
				}
				i++;
				if(i==n){
					i = 0;
				}
			}
			System.out.println(i);
		}
	}
}