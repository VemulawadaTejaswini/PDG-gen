import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		
		while(true){
			int upCnt = sn.nextInt(), downCnt = sn.nextInt();
			if(upCnt == 0 && downCnt == 0) break;
			ArrayList<Integer> times = new ArrayList<Integer>();
			for(int i = 0; i < upCnt; i++) times.add(sn.nextInt());
			for(int i = 0; i < downCnt; i++) times.add(sn.nextInt());
			times.add(0); // テッツシツ静ァツァツ津」ツ?凝」ツつ嘉・ツァツ凝」ツつ?」ツつ?
			Collections.sort(times);
			int max = 0;
			for(int i = 0; i < times.size()-1; i++){
				max = Math.max(  Math.abs(times.get(i) - times.get(i+1)) , max);
			}
			System.out.println(max);
		}
	}
}