import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String[] s = sc.nextLine().split(" ");
			String[] _s = sc.nextLine().split(" ");

			int[] a = new int[4];
			int[] b = new int[4];
			int count = 0,count_2 = 0;

			for(int i = 0; i<4 ; i++){
				a[i] = Integer.parseInt(s[i]);
				b[i] = Integer.parseInt(_s[i]);
			}

			for(int i= 0;i<4;i++){
				for(int j= 0;j<4; j++){
					if(a[i] == b[j]){
						if(i == j) count++;
						else count_2++;
					}
				}
			}
			System.out.println(count + " " +count_2);

		}
	}
}