import java.util.Scanner;
class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] num = new int[input];
		int count;
		
		for(int c = 0; c < input; c++){
			num[c] = scan.nextInt();
		}
		
		count = bubbleSort(num, input);
		
		for(int i = 0; i < input; i++){
			if(i != input - 1){
				System.out.print(num[i] + " ");
			}else{
				System.out.println(num[i]);
			}
		}
		System.out.println(count);
	}
	
	static int bubbleSort(int data[], int n){
		int temp;
		int c = 0;
		
		for(int i = 0; i < n - 1; i++){
			for(int j = n - 1; j > i; j--){
				if(data[j - 1] > data[j]){
					temp = data[j];
					data[j] = data[j - 1];
					data[j - 1] = temp;
					c++;
				}
			}
		}
		
		return c;
	}
     
}