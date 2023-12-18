import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,p[];
		
		while(true){
			n=sc.nextInt();
			if(n==0) break;
			p=new int[n];
			for(int i=0;i<n;i++){
				p[i]=sc.nextInt();
			}
			int count=0;

			if(n==1){
				System.out.println(p[0]);
			}
			else{
				for(int i=0;i<n-1;i++){
					//System.out.println(i+"!"+p[i]);
					if(p[i+1]-p[i]==1){
						count++;
					}
					else{
						if(count==0){
							System.out.print(p[i]);
						}
						else{
							System.out.print(p[i-count]+"-"+p[i]);
						}
						count=0;
						System.out.print(" ");
					}
					if(i==(n-2)){
						if(count==0){
							System.out.print(p[i+1]);
						}
						else{
							System.out.print(p[i-count+1]+"-"+p[i+1]);
						}
						count=0;
					}	
				}
				System.out.println();
			}
		}

	}

}