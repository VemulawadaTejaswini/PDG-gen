import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<Integer> List = new ArrayList<>();
		int n = sc.nextInt();
		int[] List = new int[n];
		
		for(int i=0;i<n;i++) 
				List[i] = sc.nextInt();
		
		for(int i=0;i<List.length;i++) {
			if(i == 0) {
				System.out.print(List[i]);
			}else {
				if(List[i - 1] != List[i]) {
					System.out.print(" " + List[i]);
				}
			}
			
			
		}
		System.out.println();
	}
}
