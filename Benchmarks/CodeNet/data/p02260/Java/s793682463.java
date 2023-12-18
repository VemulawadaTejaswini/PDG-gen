import java.util.Scanner;
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
			Integer mini = i;
			for(int j = i + 1; j < length; j++){
				if(mini + 1 == seq[j]){
					Integer bkp = seq[i];
					seq[i] = seq[j];
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