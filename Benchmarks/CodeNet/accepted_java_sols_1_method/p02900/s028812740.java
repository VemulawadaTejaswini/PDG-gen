import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputArr = sc.nextLine().split(" ");
		long a = Long.parseLong(inputArr[0]);
		long b = Long.parseLong(inputArr[1]);
		sc.close();
		
		ArrayDeque<Long> divisorAList = new ArrayDeque<>();
		ArrayDeque<Long> divisorBList = new ArrayDeque<>();
		
		
		long dividedValue = a;
		for(long i = 2L; i*i <= a; i++) {
			if(dividedValue % i == 0L) {
				divisorAList.add(new Long(i));
				while(dividedValue % i == 0L) {
					dividedValue /= i;
				}
			}
		}
		if(dividedValue > 1L) {
			divisorAList.add(new Long(dividedValue));
		}
		
		dividedValue = b;
		for(long i = 2L; i*i <= b; i++) {
			if(dividedValue % i == 0L) {
				divisorBList.add(new Long(i));
				while(dividedValue % i == 0L) {
					dividedValue /= i;
				}
			}
		}
		if(dividedValue > 1L) {
			divisorBList.add(new Long(dividedValue));
		}
		
		int count = 1;// 1は絶対含む
		ArrayDeque<Long> smallQueue = null;
		ArrayDeque<Long> bigQueue = null;
		if(divisorAList.size() < divisorBList.size()) {
			smallQueue = divisorAList;
			bigQueue = divisorBList;
		}else {
			smallQueue = divisorBList;
			bigQueue = divisorAList;
		}
		
		while(!smallQueue.isEmpty() && !bigQueue.isEmpty()) {
			long smallQueueTop = smallQueue.pop();
			while(!bigQueue.isEmpty()) {
				if(smallQueueTop < bigQueue.peek()) {
					break;
				}
				long bigQueueTop = bigQueue.pop();
				if(smallQueueTop == bigQueueTop) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}

}
