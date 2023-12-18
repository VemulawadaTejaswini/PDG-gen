import java.util.Scanner;
/**
 * @author saiyo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		//int x = scan.nextInt();
		//int y = scan.nextInt();
		
		//Seisu s = new Seisu(x, y);
		//s.kouyaku();

		int con = scan.nextInt();
		
		int[] num = new int[con];
		for(int i = 0; i < con; i++){
			num[i] = scan.nextInt();
		}
		Seisu s = new Seisu(num);
		System.out.println(s.getProfit());
		
		//s.countSosu();
		/*
		Sort s = new Sort(num);
		s.printSort();
		s.insertionSort();
		*/
	}

}

class Seisu{
	private int x, y;
	private int snum[];
	
	Seisu(int x, int y){
		if(x >= y){
			this.x = x;
			this.y = y;
		}else{
			this.x = y;
			this.y = x;
		}
		
	}
	
	Seisu(int snum[]){
		this.snum = new int[snum.length];
		for(int i = 0; i < snum.length; i++){
			this.snum[i] = snum[i];
		}
	}
	
	public int getProfit(){
		int fstM = this.snum[0], sa, maxProfit = this.snum[1] - this.snum[0];
		for(int i = 1; i < this.snum.length; i++){
			sa = this.snum[i] - fstM;
			if(fstM > this.snum[i]){
				fstM = this.snum[i];
			}
			if(sa > maxProfit){
				maxProfit = sa;
			}
			
		}
		return maxProfit;
	}
	
	public void countSosu(){
		int con = 0;
		for(int nu: this.snum){
			con += isSosu(nu);
		}
		System.out.println(con);
	}
	
	public int isSosu(int num){
		for(int i = 2; i < Math.sqrt(num) + 1; i++){

			if(num % i == 0 && num != 2){
				return 0;
			}
			
		}
		return 1;
	}
	
	public void kouyaku(){
		System.out.println(modSeisu(this.x, this.y));
	}
	
	
	public int modSeisu(int x, int y){
		if(x % y == 0){
			return y;
		}else{
			return modSeisu(y , x % y);
		}
	}
}

class Sort{
	private int[] sorted;
	
	Sort(int[] sorted){
		this.sorted = new int[sorted.length];
		for(int i = 0; i < sorted.length; i++){
			this.sorted[i] = sorted[i];
		}
	}
	
	public void insertionSort(){
		int v, j;
		for(int i = 1; i < this.sorted.length; i++){
			v = this.sorted[i];
			j = i - 1;
			while(j >= 0 && this.sorted[j] > v){
				this.sorted[j + 1] = this.sorted[j];
				j--;
			}
			this.sorted[j + 1] = v;
			printSort();
		}
	}
	
	public void printSort(){
		for(int i  = 0; i < this.sorted.length - 1; i++){
			System.out.print(this.sorted[i] + " ");
		}
		System.out.println(this.sorted[this.sorted.length - 1]);
	}
}

