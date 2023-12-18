import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int[] data = new int[2];
		int[] temp = new int[2];
		
		while(true){
			n = sc.nextInt();
			if(n == 0)break;
			data[0] = 0;
			data[1] = 0;
			
			for(int i=0;i<n;++i){
				
				temp[0] = sc.nextInt();
				temp[1] = sc.nextInt();
				
				if(temp[0] > temp[1]){
					data[0] += temp[0]+temp[1];
				}
				else if(temp[0] < temp[1]){
					data[1] += temp[0]+temp[1];
				}
				else{
					data[0] += temp[0];
					data[1] += temp[1];
				}
			}
			System.out.printf("%d %d\n",data[0],data[1]);
		}
		sc.close();
	}
}