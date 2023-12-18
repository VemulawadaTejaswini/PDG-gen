import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[] Stu = new int[30];
		
		for(int i = 0; i < 30; i++){
			Stu[i] = i + 1;
		}
		
		for(int i = 0; i < 28; i++){
			int a = s.nextInt();
			Stu[a - 1] = 0;
		}
		
		for(int i = 0; i < 30; i++){
			if(Stu[i] != 0){
				System.out.println(Stu[i]);
			}
		}
	}
}