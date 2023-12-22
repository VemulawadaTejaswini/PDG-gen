import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		double[] firstLine = {35.5, 37.5, 40.0, 43.0, 50.0, 55.0, 70.0};
		double[] secondLine = {71.0, 77.0, 83.0, 89.0, 105.0, 116.0, 148.0};
		int[] rank;
		double time;
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			rank = new int[3];
			time = sc.nextDouble();
			for(int i=7; i>=1; i--) {
				if(time >= firstLine[i-1]) {
					rank[0] = i;
					break;
				}
			}
			time = sc.nextDouble();
			for(int i=7; i>=1; i--) {
				if(time >= secondLine[i-1]) {
					rank[1] = i;
					break;
				}
			}
			
			rank[2] = Math.max(rank[0],rank[1]);
			switch(rank[2]) {
			case 0:
				System.out.println("AAA");
				break;
			case 1:
				System.out.println("AA");
				break;
			case 2:
				System.out.println("A");
				break;
			case 3:
				System.out.println("B");
				break;
			case 4:
				System.out.println("C");
				break;
			case 5:
				System.out.println("D");
				break;
			case 6:
				System.out.println("E");
				break;
			case 7:
				System.out.println("NA");
				break;
			}
		}
		
	}
}