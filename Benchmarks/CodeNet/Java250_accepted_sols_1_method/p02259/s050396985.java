import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer length = s.nextInt();
		Integer[] seq = new Integer[length];
		for(int i = 0; i < length; i++){
			seq[i] = s.nextInt();
		}
		Integer count = 0;
		for(int i = 0; i < length; i++){
			for(int j = length - 1; j > 0; j--){
				if(seq[j] < seq[j-1]){
					Integer bkp = seq[j-1];
					seq[j-1] = seq[j];
					seq[j] = bkp;
					count++;
				}
			}
		}
		
		for(int i = 0; i < length; i++){
			if(i == length - 1){
				System.out.print(seq[i] + "\n");
			}
			else{
				System.out.print(seq[i] + " ");
			}
		}
		System.out.println(count);
	}

}