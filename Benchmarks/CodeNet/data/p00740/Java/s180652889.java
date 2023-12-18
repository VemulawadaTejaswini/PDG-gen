import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,p,ans;
		int mayor[];

		while(true){
			n=sc.nextInt();
			p=sc.nextInt();

			if(n+p==0) break;
			mayor=new int[n];
			for(int i=0;;i++){
				if(p==0){
					p=mayor[i%n];
					mayor[i%n]=0;
				}
				else{
					mayor[i%n]++;
					p--;
					if(p==0){
						if(check(n,i%n,mayor)){
							ans=i%n;
							break;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
	static boolean check(int n,int k,int m[]){

		for(int i=0;i<n;i++){
			if(i!=k){
				if(m[i]!=0){
					return false;
				}
			}
		}

		return true;
	}

}