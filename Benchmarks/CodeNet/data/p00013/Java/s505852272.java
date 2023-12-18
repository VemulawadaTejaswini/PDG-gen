import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[20];
		int i = 0;
		while(stdIn.hasNext()){
			a[i] = stdIn.nextInt();
			i++;
		}
		
Outer:		
		for(int j=0; j<20; j++){
			if(a[j]==0){
				for(int k=1,m=0; ; k++,m++){
					if(a[j-k]!=0) {
						if(j-k-m < 0) break Outer; else System.out.println(a[j-k-m]);
						break;
					}
				}
			}				
		}			
			
	}		
}