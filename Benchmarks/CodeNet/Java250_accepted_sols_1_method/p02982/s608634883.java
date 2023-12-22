import java.util.ArrayList;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int dotCount = Integer.parseInt(line[0]);
		int dimCount = Integer.parseInt(line[1]);
		
		ArrayList<String[]> list = new ArrayList();
		for(int i = 0;i<dotCount;i++) {
			list.add(sc.nextLine().split(" "));
		}
		
		int result = 0;
		for(int i = 0;i<dotCount;i++) {
			for(int j = i+1;j<dotCount;j++) {
				
				double distatnFrom1to2 = 0d;
				String[] strArray1 = list.get(i);
				String[] strArray2 = list.get(j);
				for(int x = 0;x<dimCount;x++) {
					int tmp = Math.abs(Integer.parseInt(strArray1[x]) 
							- Integer.parseInt(strArray2[x]));
					distatnFrom1to2 += tmp*tmp;
				}
				
				double checkDouble = Math.sqrt(distatnFrom1to2);
				if(checkDouble == (int)checkDouble) {
					result++;
				}
				
				
			}
		}
		System.out.println(result);
	}
}