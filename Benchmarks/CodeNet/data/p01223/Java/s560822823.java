import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		for(int i=0;i<loop;i++){
			int n = sc.nextInt();
			int[] map = new int[n];
			for(int j=0;j<n;j++){
				map[j] = sc.nextInt();
			}

			int maxup=0;
			int maxdown=0;

			for(int j=0;j<n-1;j++){
				if(map[j] < map[j+1]){
					if(maxup < (map[j+1]-map[j])){
						maxup = map[j+1] - map[j];
					}
				}else{
					if(maxdown < (map[j]-map[j+1])){
						maxdown = map[j] - map[j+1];
					}
				}
			}

			System.out.println(maxup+" "+maxdown);
		}
	}

}