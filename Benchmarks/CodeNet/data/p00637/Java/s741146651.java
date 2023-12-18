import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,k;
		int str[],goal[],in[];
		while(true){
			n=sc.nextInt();
			k=0;
			str=new int[n];
			goal=new int[n];
			in=new int[n];
			if(n==0) break;
			for(i=0;i<n;i++){
				in[i]=sc.nextInt();
			}
			for(i=0;i<n-1;i++){
				if(k==0) str[0]=in[0];
				if(in[i]!=in[i+1]-1){
					goal[k]=in[i];
					k++;
					str[k]=in[i+1];
				}
			}
			goal[k]=in[i];
			k++;
			boolean f=false;
			for(i=0;i<k;i++){
				if(!f){
					if(str[i]!=goal[i]){
						System.out.print(str[i]+"-"+goal[i]);
					}
					else{
						System.out.print(str[i]);
					}
					f=true;
				}
				else if(f){
					if(str[i]!=goal[i]){
						System.out.print(" "+str[i]+"-"+goal[i]);
					}
					else{
						System.out.print(" "+str[i]);
					}
				}
			}
			System.out.println();
		}
	}

}