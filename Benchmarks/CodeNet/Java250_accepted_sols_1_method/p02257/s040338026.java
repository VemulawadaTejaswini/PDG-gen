import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean is_prime = true;
		Integer[] prime_10 = {2, 3, 5, 7};
		ArrayList<Integer> prime_100 = new ArrayList<Integer>(Arrays.asList(prime_10));
		for(int i = 10; i < 100; i++){
			is_prime = true;
			for(int j = 0; j < prime_10.length; j++){
				if(i %  prime_10[j] == 0){
					is_prime = false;
					break;
				}
			}
			if(is_prime){
				prime_100.add(i);
			}
		}

		ArrayList<Integer> prime_10000 = new ArrayList<Integer>();
		for(int i = 2; i < 10000; i++){
			is_prime = true;
			for(int j = 0; j < prime_100.size(); j++){
				Integer prime = prime_100.get(j);
				if(i != prime&& i % prime == 0){
					is_prime = false;
					break;
				}
			}
			if(is_prime){
				prime_10000.add(i);
			}
		}

		ArrayList<Integer> result = new ArrayList<Integer>();
		while(s.hasNext()){
			Integer number = Integer.parseInt(s.next());
			is_prime = true;
			if(result.contains(number)){
				continue;
			}
			for(int j = 0; j < prime_10000.size(); j++){
				Integer prime = prime_10000.get(j);
				if(!number.equals(prime) && number % prime == 0){
					is_prime = false;
					break;
				}
			}
			if(is_prime){
				result.add(number);
			}
		}
		System.out.println(result.size());
		s.close();
	}
}