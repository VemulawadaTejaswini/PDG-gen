import java.util.Scanner;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		String[] cards = new String[input];
		int[] number = new int[input];
		boolean b;
		
		String[] cards_bubble = new String[input];
		String[] cards_select = new String[input];
		int[] number_bubble = new int[input];
		int[] number_select = new int[input];
		
		for(int c = 0; c < input; c++){
			cards[c] = scan.next();
			number[c] = cards[c].charAt(1) - '0';

			cards_bubble[c] = cards[c];
			cards_select[c] = cards[c];

			number_bubble[c] = number[c];
			number_select[c] = number[c];
		}

		
		BubbleSort(number_bubble, input, cards_bubble);
		System.out.println("Stable");

		SelectionSort(number_select, input, cards_select);
		b = isStable(number_select, input, cards_select, cards);
		if(b){
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}

	}

	static void BubbleSort(int data[], int n, String str[]){
		int temp;
		String card_temp;

		for(int i = 0; i < n - 1; i++){
			for(int j = n - 1; j > i; j--){
				if(data[j - 1] > data[j]){
					temp = data[j];
					data[j] = data[j - 1];
					data[j - 1] = temp;
					
					card_temp = str[j];
					str[j] = str[j - 1];
					str[j - 1] = card_temp;
				}
			}
		}
		Print(str, n);
	}

	static void SelectionSort(int data[], int n, String str[]){
		int temp;
		String card_temp;
		int min;
		boolean b;

		for(int i = 0; i < n - 1; i++){
			min = i;
			b = false;

			for(int j = i + 1; j < n; j++){
				if(data[j] < data[min]){
					min = j;
					b = true;
				}
			}
			if(b){
				temp = data[i];
				data[i] = data[min];
				data[min] = temp;

				card_temp = str[i];
				str[i] = str[min];
				str[min] = card_temp;
			}
		}
		Print(str, n);
	}
	
	static boolean isStable(int data[], int n, String in_str[], String out_str[]){
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n - 1; j++){
				for(int a = 0; a < n - 1; a++){
					for(int b = a + 1; b < n - 1; b++){
						if(data[i] == data[j] && in_str[i].equals(out_str[b]) && in_str[j].equals(out_str[a])){
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	
	
	static void Print(String str[], int n){
		for(int i = 0; i < n; i++){
			if(i != n -1){
				System.out.print(str[i] + " ");
			}else{
				System.out.println(str[i]);
			}
		}
	}
}