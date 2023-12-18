import java.util.*;

class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		while(true){
			int count = 0;
			int n = Integer.parseInt(in.next());
			int x = Integer.parseInt(in.next());
			if(n==0 && x==0)
				break;
		  
			for(int i=1;i<n+1;i++){
				for(int j=i+1;j<n+1;j++){
					for(int k=j+1;k<n+1;k++){
						if(i!=j && j!=k && i+j+k==x){
							count++;
						}
					}
				}
			}
			System.out.println(count);	
		}
	}	
}