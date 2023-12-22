import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;
		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();
			String[] tmpArray = line.split(" ");
			int numA = Integer.parseInt(tmpArray[0]);
			int numB = Integer.parseInt(tmpArray[1]);

			
			int[] tmpList = new int[numB];
			int tmpInd = 0;
			for (int i = 0; i < numA; i++) {
				line = sc.nextLine();
				String[] tmp = line.split(" ");
				for (int j = 0; j < tmp.length; j++) {
					if (j==0) continue;
					tmpInd = Integer.parseInt(tmp[j]);
					tmpList[tmpInd-1] ++;
				}
				}
			int reult = 0;
			for(int k : tmpList){
				if(k == numA){
					reult ++;
				}
			}
				
			System.out.println(reult);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}