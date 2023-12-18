
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> inputs = new ArrayList<Integer>();
		//ArrayList<Integer> results = new ArrayList<Integer>();
		
		setInputs(inputs);
		
		for(int i = 0; i < inputs.size(); i++){
			System.out.println(findCombinationsFaster(inputs.get(i)));
		}
	}
	
	private static void setInputs(ArrayList<Integer> inputs){
		Scanner sc = new Scanner(System.in);
		
		try{
			while(true){
				inputs.add(sc.nextInt());
			}
		}catch(NoSuchElementException e){
			//EOFツ・EOTツつェツ禿シツ療債つウツづェツつスツづァツ篠淞づ個渉按猟敖づーツ行ツつ、
		}
	}
	
	private static int findCombinationsFaster(int sum){
		int numCombinations = 0;
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				for(int k = 0; k < 10; k++){
					for(int l = 9; l > -1; l--){
						if(isBigger(sum, i, j, k, l)){
							break;
						}
						else if(isSame(sum, i, j, k, l)){
							numCombinations++;
						}
					}
				}
			}
		}
		return numCombinations;
	}
	
	private static int findCombinations(int sum){
		int numCombinations = 0;
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				for(int k = 0; k < 10; k++){
					for(int l = 0; l < 10; l++){
						if(isSame(sum, i, j, k, l)){
							numCombinations++;
						}
					}
				}
			}
		}
		return numCombinations;
	}
	
	private static boolean isBigger(int sum, int i, int j, int k, int l){
		if(sum > (i + j + k + l)){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static boolean isSame(int sum, int i, int j, int k, int l){
		if(sum == (i + j + k + l)){
			return true;
		}
		else{
			return false;
		}
	}
}