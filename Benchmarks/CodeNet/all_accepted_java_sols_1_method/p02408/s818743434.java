import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] mark = new String[size];
		int[] rank = new int[size];
		Boolean flag = false;
		for(int i = 0; i < size; i++){
			mark[i] = sc.next();
			rank[i] = sc.nextInt();
		}
		for(int i = 1; i < 14; i++){
			for(int j = 0; j < size; j++){
				if(mark[j].equals("S") && rank[j] == i)
						flag = true;
			}
			if(flag == false){
				System.out.println("S " + i);
			}
			flag = false;
		}
		for(int i = 1; i < 14; i++){
			for(int j = 0; j < size; j++){
				if(mark[j].equals("H") && rank[j] == i)
						flag = true;
			}
			if(flag == false){
				System.out.println("H " + i);
			}
			flag = false;
		}
		for(int i = 1; i < 14; i++){
			for(int j = 0; j < size; j++){
				if(mark[j].equals("C") && rank[j] == i)
						flag = true;
			}
			if(flag == false){
				System.out.println("C " + i);
			}
			flag = false;
		}
		for(int i = 1; i < 14; i++){
			for(int j = 0; j < size; j++){
				if(mark[j].equals("D") && rank[j] == i)
						flag = true;
			}
			if(flag == false){
				System.out.println("D " + i);
			}
			flag = false;
		}
	}
}