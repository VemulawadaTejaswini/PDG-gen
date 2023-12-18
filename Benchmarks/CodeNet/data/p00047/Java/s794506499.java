import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] map = {"A","B","C"};
		int[] point = new int[3];
		point[0]++;
		while(!sc.hasNext()){
			String[] lo = sc.nextLine().split(",");
			int temp;
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					if(lo[0].equals(map[i]) & lo[1].equals(map[j])){
						temp = point[i];
						point[i] = point[j];
						point[j] = temp;
					}
				}
			}

		}
		for(int i = 0; i < 3; i++){
			if(point[i] != 0) System.out.println(map[i]);
		}
	}
}