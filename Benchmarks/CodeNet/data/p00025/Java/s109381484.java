
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	private static final int MAX_NUMBERS = 4;

	public static void main(String[] args) {
		int[] a = new int[MAX_NUMBERS];
		int[] b = new int[MAX_NUMBERS]; 
		ArrayList<Integer> resultHit = new ArrayList<Integer>();
		ArrayList<Integer> resultBrow = new ArrayList<Integer>();
		
		try{
			while(true){
				setInputs(a, b);
				resultHit.add(getNumHit(a, b));
				resultBrow.add(getNumBrow(a, b));
			}
		}catch(NoSuchElementException e){
			//½àµÈ¢ÅÌÉ¤Âé
		}
		
		//qbgÆu[ÌÊXgðoÍ·é
		for(int i = 0; i < resultHit.size(); i++){
			System.out.println(resultHit.get(i) + " " + resultBrow.get(i));
		}
		
	}
	
	private static void setInputs(int[] a, int[] b){
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < MAX_NUMBERS; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < MAX_NUMBERS; i++){
			b[i] = sc.nextInt();
		}
	}
	
	private static boolean checkBrow(int[] a, int[] b, int index){
		int target = b[index];
		for(int i = 0; i < MAX_NUMBERS; i++){
			if(i == index){
				//u[Í¯¶ÊuÌð`FbNµÈ¢
			}
			else if(a[i] == target){
				return true;
			}
		}
		return false;
	}
	
	private static boolean checkHit(int[] a, int[] b, int index){
		if(a[index] == b[index]){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static int getNumBrow(int[] a, int[] b){
		int count = 0;
		for(int i = 0; i < MAX_NUMBERS; i++){
			if(checkBrow(a, b, i)){
				count++;
			}
		}
		return count;
	}
	
	public static int getNumHit(int[] a, int[] b){
		int count = 0;
		for(int i = 0; i < MAX_NUMBERS; i++){
			if(checkHit(a, b, i)){
				count++;
			}
		}
		return count;
	}
}