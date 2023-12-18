import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] k = new int[10000];
			int m = 0;	
			int Count = 0;
			int COUNT = 0;
			
			if (n == 0) break;
			for (int count =0;count<n;count++){
					k[count] = sc.nextInt();
					if(k[count] < 2)Count++;
					m = m + k[count];
					if(k[count] == 0)break;
				}
				
			if(Count == n) {System.out.println("NA");break;}
			while(true){			
			for(int count = 0; count < n; count++){
							if(k[count]<=2){
							k[count]=k[count] - 1;
							Count++;
								if(k[count] == 0)break;
							}
							
						}
			System.out.println(COUNT);
					}
			
		}
	}
	
}