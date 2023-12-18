import java.util.Scanner;

class IntStore {
	private int[] storage = new int[3];
	
	public void store(int l, int data){
		storage[l] = data;
	}
	
	private void swap (int i, int j){
		int tmp = storage[i];
		storage[i] = storage[j];
		storage[j] = tmp;
	}
	
	public void order (){
		for (int i = 0; i < 3; i++){
			for (int j = i + 1; j < 3; j++){
				if (storage[i] > storage[j]){
					swap(i, j);
				}
			}
		}
	}
	public String str(){
		return storage[0] + " " + storage[1] + " " + storage[2];
	}
}

public class Main {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStore dataStore = new IntStore();
		for (int i = 0; i < 3; i++){
			dataStore.store(i, sc.nextInt());
		}
		dataStore.order();
		System.out.println(dataStore.str());
	}
}