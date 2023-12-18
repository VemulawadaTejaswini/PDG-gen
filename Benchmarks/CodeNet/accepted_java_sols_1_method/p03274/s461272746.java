import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		int result = Integer.MAX_VALUE;		
		Scanner scanner = new Scanner(System.in);		
		int total = scanner.nextInt();
		int burnd = scanner.nextInt();
		int zeroIdx = 0;
		
		List<Integer> point = new ArrayList<Integer>();
		boolean zeroFalg = false;
		for(int i = 0; i < total; i++) {
			int idx = scanner.nextInt();
			if(idx < 0) {
				zeroIdx++;
			}
			if(idx == 0) {				
				zeroFalg = true;
				continue;
			}
			point.add(idx);
		}
		
		if(zeroFalg) {
			total--;
			burnd--;
		}
		
		int firstIdx = zeroIdx - burnd < 0 ? 0 : zeroIdx - burnd ;
		int lastIdx =  zeroIdx + burnd - 1 >= total? total - 1 :  zeroIdx + burnd - 1;
		
		int nums = total > zeroIdx ? zeroIdx + 1:zeroIdx;
		
		if(burnd == 0) {
			result = 0;
		}else {
			for(int i = firstIdx; i < nums; i++) {			
				int totalLeft = 0;
				int totalRight = 0;
				int nextIdx = i + burnd - 1;
				
				if(nextIdx > lastIdx) {
					break;
				}
				
				if(i < zeroIdx) {
					totalLeft = Math.abs(point.get(i));
				}				
				
				if(nextIdx >= zeroIdx) {
					totalRight = point.get(nextIdx);
				}
				
				
				result =Math.min(result,  Math.min(2*totalLeft + totalRight, totalLeft + 2*totalRight));
			}		
		}
		

		System.out.println(result);

	}

}
