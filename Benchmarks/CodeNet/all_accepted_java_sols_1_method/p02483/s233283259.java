import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int input[] = new int[3];
		for(int i=0;i<3;i++){
			input[i] = a.nextInt();
		}
		Arrays.sort(input);
		for(int i=0;i<2;i++){
			System.out.print(input[i]+" ");
		}
		System.out.println(input[2]);
	}

}