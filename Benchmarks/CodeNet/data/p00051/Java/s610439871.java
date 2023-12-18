import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	static Comparator<Character> downer= new Comparator<Character>(){
        public int compare (Character ch1, Character ch2) {
            return (ch1.compareTo(ch2));
        }
    };
    
    static Comparator<Character> upper= new Comparator<Character>(){
        public int compare (Character ch1, Character ch2) {
            return (ch1.compareTo(ch2));
        }
    };
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++){
			String str = sc.nextLine();
			List<Character> max_list = new ArrayList<Character>();
			List<Character> min_list = new ArrayList<Character>();
			
			for(char c:str.toCharArray()){
				max_list.add(c);
				min_list.add(c);
			}
			
			Collections.sort(max_list);
			Collections.reverse(max_list);
			Collections.sort(min_list);
			
			
			StringBuilder b1 = new StringBuilder();
			for(char c:max_list){
				b1.append(c);
			}
			
			StringBuilder b2 = new StringBuilder();
			for(char c:min_list){
				b2.append(c);
			}
			
			int max = Integer.parseInt(b1.toString());
			int min = Integer.parseInt(b2.toString());
			
			System.out.println(max - min);
		}
		
	}
}