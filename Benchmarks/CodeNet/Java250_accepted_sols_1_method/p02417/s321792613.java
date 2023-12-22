import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String[] abc = "abcdefghijklmnopqrstuvwxyz".split("");
		int[] cnt = new int[abc.length];
		
		while(sc.hasNext()){
			String[] text = sc.nextLine().split("");
			
			for(int i=0; i<text.length; i++){
				for(int j=0; j<abc.length; j++){
					if(text[i].equals(abc[j]) || text[i].equals(abc[j].toUpperCase())){
						cnt[j]++;
					break;
					}
				}
			}
		}
		
		for(int j=0; j<abc.length; j++){
			System.out.println(abc[j] + " : " + cnt[j]);
		}
	}

}