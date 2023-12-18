import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int candidates = sc.nextInt();
			int first_num = sc.nextInt();
			if(candidates==0 && first_num==0) break;

			int[] stone = new int[candidates];
			stone[0]++;
			int bowl = first_num - 1;
			int i = 0;

			while(first_num!=bowl){
				i = (i+1)%candidates;
				if(bowl>0){
					stone[i]++;
					bowl--;
				}else{
					bowl = stone[i];
					stone[i] = 0;
				}
			}
			System.out.println(i);
		}
	}
}