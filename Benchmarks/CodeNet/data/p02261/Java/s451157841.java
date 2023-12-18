import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer length = s.nextInt();
		String[] seq = new String[length];
		for(int i = 0; i < length; i++){
			seq[i] = s.next();
		}
		s.close();
		String[] seq_bubble = seq.clone(); 
		String[] seq_select = seq.clone(); 

		for(int i = 0; i < length; i++){
			for(int j = length - 1; j > i; j--){
				Integer value_a = Integer.parseInt(seq_bubble[j].substring(1));
				Integer value_b = Integer.parseInt(seq_bubble[j - 1].substring(1));
				if(value_a < value_b){
					String bkp = seq_bubble[j];
					seq_bubble[j] = seq_bubble[j - 1];
					seq_bubble[j - 1] = bkp;
				}
			}
		}

		for(int i = 0; i < length; i++){
			Integer mini = i;
			for(int j = i; j < length; j++){
				Integer value_a = Integer.parseInt(seq_select[j].substring(1));
				Integer value_b = Integer.parseInt(seq_select[mini].substring(1));
				if(value_a < value_b){
					mini = j;
				}
			}
			String bkp = seq_select[i];
			seq_select[i] = seq_select[mini];
			seq_select[mini] = bkp;
		}
		print_seq(seq_bubble, length);
		System.out.println("Stable");
		print_seq(seq_select, length);
		boolean is_reliable = true;
		for(int i = 0; i < length; i++){
			if(!seq_bubble[i].equals(seq_select[i])){
				is_reliable = false;
				break;
			}
		}
		if(is_reliable){
			System.out.println("Stable");
		}
		else{
			System.out.println("Not stable");
		}
			
	}

	private static void print_seq(String[] seq, Integer length){
		for(int i = 0; i < length; i++){
			if(i == length - 1){
				System.out.print(seq[i] + "\n");
			}
			else{
				System.out.print(seq[i] + " ");
			}
		}
		
	}
}