import java.util.Scanner;

public class Main {
	
	private static int[] sequence;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int length = 1;
		while(length < n){
			length <<= 1;
		}
		sequence = new int[length + 1];
		for(int i = 0; i < q; i++){
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(com == 0){
				add(x, y);
			}else{
				System.out.println(getSum(x, y));
			}
		}
		sc.close();
	}
	
	private static void add(int index, int num){
		if(index > 0 && index < sequence.length){
			sequence[index] += num;
			int nextIndex = index + (index & -index);
			add(nextIndex, num);
		}
	}
	
	private static int getSum(int s, int t){
		return getSum(t) - getSum(s - 1);
	}
	
	private static int getSum(int index){
		if(index > 0 && index < sequence.length){
			int prevIndex = index - (index & -index);
			return sequence[index] + getSum(prevIndex);
		}else{
			return 0;
		}
	}
}