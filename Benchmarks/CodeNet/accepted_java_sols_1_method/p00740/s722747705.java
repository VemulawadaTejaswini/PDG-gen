
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n=0,p=0,o=0,x=0,flag=0;
			n=scan.nextInt();
			p=scan.nextInt();
			if(n==0 && p==0){
				break;
			}
			o=p;
			int[] list;
			list = new int[n];
			for(int i=0;i<n;i++){
				list[i]=0;
			}
			while(true){
				for(int i=0;i<n;i++){
					if(p==0){
						p+=list[i];
						list[i]=0;
					}else{
						list[i]+=1;
						p--;
						if(list[i]==o){
							x=i;
							flag=1;
							System.out.println(x);
							break;
						}
					}
				}
				if(flag==1){
					break;
				}
			}
		}
	}
}

