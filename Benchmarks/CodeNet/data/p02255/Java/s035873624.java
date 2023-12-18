import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int con = scan.nextInt();
		int[] num = new int[con];
		for(int i = 0; i < con; i++){
			num[i] = scan.nextInt();
		}
		Sort s = new Sort(num);
		s.printSort();
		s.insertionSort();
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

