
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> trainsIn = new ArrayList<Integer>();
		ArrayList<Integer> trainsOut = new ArrayList<Integer>();
		
		try{
			while(true){
				int n = sc.nextInt();
				switch(n){
				case 0:
					popTrain(trainsIn, trainsOut);
					break;
				default:
					pushTrain(trainsIn, n);
					break;
				}
			}
		}catch(NoSuchElementException e){
			//½àµÈ¢
		}
		
		for(int i = 0; i < trainsOut.size(); i++){
			System.out.println(trainsOut.get(i));
		}
	}
	
	private static void pushTrain(ArrayList<Integer> trains, int n){
		trains.add(n);
	}
	
	private static void popTrain(ArrayList<Integer> trains, ArrayList<Integer> trainsOut){
		Integer firstTrain = trains.get(trains.size() - 1);
		trainsOut.add(firstTrain);
		trains.remove(trains.size() - 1);
	}
}