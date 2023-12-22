import java.util.*;

class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int gu=0, choki=0, pa = 0;
			for(int i=0; i<5; i++){
				int res = in.nextInt();
				if(res == 0) return ;
				else if(res == 1) gu |= (1<<i);
				else if(res == 2) choki |= (1<<i);
				else if(res == 3) pa |= (1<<i);
			}
			int win=0;
			if(Integer.bitCount(gu)>0) win    |= 1;
			if(Integer.bitCount(choki)>0) win |= (1<<1);
			if(Integer.bitCount(pa)>0) win    |= (1<<2);
			if(Integer.bitCount(win) != 2){
				for(int i=0; i<5; i++)
					System.out.println(3);
			}
			else{
				if((win & 1)==0){
					for(int i=0; i<5; i++){
						System.out.println(((choki & (1<<i)) > 0)?1:2);
					}
				}
				if((win & 2)==0){
					for(int i=0; i<5; i++){
						System.out.println(((pa & (1<<i)) > 0)?1:2);
					}
				}
				if((win & 4)==0){
					for(int i=0; i<5; i++){
						System.out.println(((gu & (1<<i)) > 0)?1:2);
					}
				}
			}
		}
	}
	
}