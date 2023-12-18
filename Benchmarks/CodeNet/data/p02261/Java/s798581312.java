import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] strArray = br.readLine().split(" ");
		Card[] cards1 = new Card[n];
		Card[] cards2 = new Card[n];
		
		for(int i = 0; i < n; i++){
			cards1[i] = new Card(strArray[i]);
			cards2[i] = new Card(strArray[i]);
		}
		
		bubbleSor(cards1, n);
		printArray(cards1);
		isStable(cards1);
		
		selectionSort(cards2, n);
		printArray(cards2);
		isStable(cards2);
	}

	static int bubbleSor(Card[] array, int n){
		int flag = 1;
		int count = 0;
		while(flag == 1){
			flag = 0;
			for(int j = n - 1; j >= 1; j--){
				if(array[j].number < array[j - 1].number){
					Card tmp = array[j];
					array[j]  = array[j - 1];
					array[j - 1] = tmp;
					flag = 1;
					count++;
				}
			}
		}

		return count;
	}

	static int selectionSort(Card[] array, int n){
		int count = 0;
		for(int i = 0; i < n; i++){
			int minJ = i;
			for(int j = i; j < n; j++){
				if(array[j].number < array[minJ].number){
					minJ = j;
				}
			}
			Card tmp = array[i];
			array[i]  = array[minJ];
			array[minJ] = tmp;
			if(i != minJ){
				count++;
			}
		}

		return count;
	}
	
	static void isStable(Card[] array){
		//int number = array[0].number;
		boolean result = true;
		for(int i = 1 ; i < array.length ; i++){
			if(array[i - 1].number == array[i].number && array[i - 1].getID() > array[i].getID()){
				result =  false;
			}
		}
		
		if(result){
			System.out.println("Stable");
		}
		else{
			System.out.println("Not stable");
		}
	}

	static void printArray(Card[] array){
		for(int i = 0; i < array.length ;i++){
			System.out.print(array[i].toString());
			if(i != array.length - 1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}

class Card {
	private static int idSeed = 0;
	private int id;
	char mark;
	int number;

	public Card(char mark, int number) {
		// TODO ?????????????????????????????????????????????????????????
		this.mark = mark;
		this.number = number;
		this.id = idSeed;
		this.idSeed++;
	}

	public Card(String str){
		if(str.length() != 2){
			this.mark = 0;
			this.number = -1;
		}

		else{
			this.mark = str.charAt(0);
			this.number = Character.digit(str.charAt(1), 10);
		}
		this.id = idSeed;
		this.idSeed++;
	}

	public String toString(){
		return mark + "" + number;
	}
	
	public int getID(){
		return id;
	}
}