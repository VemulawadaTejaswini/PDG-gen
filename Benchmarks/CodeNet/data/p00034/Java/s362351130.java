
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	private static final int NOT_MEET_OPPOSITE = -1;
	private static final int NUM_BLOCKS = 10;
	private static final int INPUT_VELOCITY1 = NUM_BLOCKS;
	private static final int INPUT_VELOCITY2 = INPUT_VELOCITY1 + 1;
	
	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		try{
			while(true){
				String[] input = getInput();
				int velocity1 = Integer.valueOf(input[INPUT_VELOCITY1]);
				int velocity2 = Integer.valueOf(input[INPUT_VELOCITY2]);
				int[] blockDistance = new int[NUM_BLOCKS];
				for(int i = 0; i < blockDistance.length; i++){
					blockDistance[i] = Integer.valueOf(input[i]);
				}
				result.add(getBlockMeetOpposite(velocity1, velocity2, blockDistance));
			}
		}catch(NoSuchElementException e){
			//何もしない
		}
		
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
	
	public static String[] getInput(){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input.split(",");
	}

	private static double getTimeMeetOpposite(int velocity1, int velocity2, int[] blockDistance){
		int distance = 0;
		for(int i = 0; i < blockDistance.length; i++){
			distance += blockDistance[i];
		}
		return (double)distance / (double)(velocity1 + velocity2);
	}
	
	public static int getBlockMeetOpposite(int velocity1, int velocity2, int[] blockDistance){
		double time = getTimeMeetOpposite(velocity1, velocity2, blockDistance);
		double distanceMeetOpposite = time * (double)velocity1;
		double distance = 0;
		for(int i = 0; i < blockDistance.length; i++){
			distance += (double)blockDistance[i];
			if(distanceMeetOpposite <= distance){
				return i + 1;
			}
		}
		return NOT_MEET_OPPOSITE;
	}
}