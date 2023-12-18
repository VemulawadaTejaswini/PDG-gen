import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] i = new int[3];
		
		for(int j = 0; j < 3; j++){
			i[j] = sc.nextInt();
		}
		
		Arrays.sort(i);

		System.out.println(i[0] + " " + i[1] + " " + i[2]);
	}
}