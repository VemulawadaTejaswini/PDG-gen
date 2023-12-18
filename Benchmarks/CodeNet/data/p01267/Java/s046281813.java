import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int A,B,C,X;
		int x=0;
		int target=0;

		for(;;){
			n=sc.nextInt();
			if(n==0){
				return;
			}
			A=sc.nextInt();
			B=sc.nextInt();
			C=sc.nextInt();
			X=sc.nextInt();
			int sum=0;
			
			for(int i=0;i<n;i++){
				target = sc.nextInt();
			    if(i==0){
					x=X;
				}
				if(i==0&&x==target){
					continue;
				}else{
				    for(int j=1;;j++){
				    	x=A*x+B;
					    x%=C;
					    if(x==target){
						    sum+=j;
							break;
				        }else if(j>10000){
							sum=10001;
							break;
						}
				    }
				}
			}
			
			if(sum>10000){
				System.out.println(-1);
			}else{
			    System.out.println(sum);
			}
				  
		}	

	}
}
