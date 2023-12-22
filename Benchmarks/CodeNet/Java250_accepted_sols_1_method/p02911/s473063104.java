import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String[][] array = new String[8][8];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int saite = q-k+1;
		//String[] array = new String[n];
		Integer[] count = new Integer[n];
		for(int i=0;n>i;i++) {
			count[i]=0;
		}
		if(saite<=0) {
			for(int i=0;q>i;i++) {
				int a = sc.nextInt();
				count[a-1]++;
			}
			for(int i=0;n>i;i++) {
				System.out.println("Yes");
			}
		}

		else {
			for(int i=0;q>i;i++) {
				int a = sc.nextInt();
				count[a-1]++;
			}
			for(int i=0;n>i;i++) {
				if(count[i]>=saite)
					System.out.println("Yes");
				else {
					System.out.println("No");
				}
			}
		}
	}

}