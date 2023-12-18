import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n,x,a=0;
			n=cin.nextInt();
			x=cin.nextInt();
			if(n==0 && x==0){
				break;
			}
			for(int i=1;i<n+1;i++){
				for(int j=1;j<n+1;j++){
					for(int k=1;k<n+1;k++){
						if(i+j+k==x && i<j && j<k){
							a=a+1;
						}
					}
				}
			}
		System.out.println(a);
		}
	}

}