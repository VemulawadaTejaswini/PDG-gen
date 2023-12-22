import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
	//??\??????????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //????????°?????????
        int numberCount = Integer.parseInt(br.readLine());
        //???????????¶????????°??????????????????
        String[] sNumbers = br.readLine().split(" ");
        //????????°?????????????????????
        int[] numbers = new int[numberCount];
        //?????????????????°????????????
        for(int i = 0 ; i < numberCount ; i++){
        	numbers[i] = Integer.parseInt(sNumbers[i]);
        }
        insertionSort(numbers);
	}
	
	private static void insertionSort(int[] numbers){
		displayNumbers(numbers);
		for(int i = 1 ; i < numbers.length ; i++){
			int currentNumber = numbers[i];
			int insertIndex = i;
			for(int y = i - 1 ; y >= 0 ; y--){
				if(currentNumber < numbers[y]){
					numbers[y + 1] = numbers[y];
					insertIndex = y;
				}else{
					break;
				}
			}
			numbers[insertIndex] = currentNumber;
			displayNumbers(numbers);
		}
	}
	
	private static void displayNumbers(int[] numbers){
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < numbers.length ; i++){
			sb.append(numbers[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}