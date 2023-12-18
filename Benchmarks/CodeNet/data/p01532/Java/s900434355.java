import java.util.Scanner;

public class Main {

	static int N,T,H,L;
	static int[][] person;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		N=cin.nextInt();
		T=cin.nextInt();
		H=cin.nextInt();
		L=cin.nextInt();
		person=new int[N][2];
		for(int i=0;i<N;i++){
			person[i][0]=cin.nextInt();
			person[i][1]=cin.nextInt();
		}
		int p=0;
		int current=0;
		while(true){
//			System.out.println(person[p][0]+" "+person[p][1]+" "+p);
			if(person[p][0]+person[p][1]==0){
				break;
			}			
			boolean haratta=false;
			//10yen
			if(person[p][0]!=0){
				person[p][0]--;
				current+=10;
				T++;
				haratta=true;
			}
			
			//is broken
			if(T>L){
				break;
			}
			
			//100yen
			if(!haratta){
				if(current!=90&&person[p][1]!=0){
					current+=100;
					person[p][1]--;
					H++;
				}
				
			}
			//おつり
			if(current==90){
				current=0;
			}
			else if(current<90){
				
			}
			else{
				int oturi=current-90;
				if(oturi==100){
					if(H==0)break;
					H--;
					oturi=0;
				}
				else{
					if(oturi/10 > T)break;
					person[p][0]+=oturi/10;
					T-=oturi/10;	
				}
			}

			p=(p+1)%N;
		}
		System.out.println(p+1);
	}

}