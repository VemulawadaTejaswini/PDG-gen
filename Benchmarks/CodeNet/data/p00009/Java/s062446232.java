import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] pri = new int[500000];
		pri[0] = 2;
		pri[1] = 3;
		pri[2] = 5;
		pri[3] = 7;
		pri[4] = 11;
		pri[5] = 13;
		pri[6] = 17;
		pri[7] = 19;
		pri[8] = 23;
		pri[9] = 29;
		int fl = 0;
		int a=0;
		int b=0;
		int c=0;
		while(pri[a]<1000000){
			fl++;
			for(int i=0;i<8;i++){
				a=0;
				b=0;
				c=0;				
				if(i==0){
					c=1;
				}else if(i>0){
					c=pri[2+i];
				}
				while(pri[a]!=0){
					if((30*fl + c)%pri[a]==0){
						b=1;
						break;
					}
					a++;
				}
				if(b==0){
					pri[a]=(30*fl + c);
				}
			}					
		}
		
		boolean exit = true;
		while(sc.hasNext()){
			int n = sc.nextInt();
			int sum=-1;
			int i=0;
			while(true){
				sum++;
				if(pri[i]>n)break;
				i++;
			}
			System.out.println(sum);
		}
	}
	
}