import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int switchCount = sc.nextInt();
		int lampCount = sc.nextInt();
		List<int[]> switchInfo = new ArrayList<int[]>();
		for(int i =0;i < lampCount;i++) {
			int connectSwitch = sc.nextInt();
			int[] connectSwitchInfo = new int[connectSwitch];
			for(int j =0; j < connectSwitch; j++) {
				connectSwitchInfo[j] = sc.nextInt();
			}
			switchInfo.add(connectSwitchInfo);
		}
		int[] onOffInfo = new int[lampCount];
		for(int i =0;i < lampCount; i++) {
			onOffInfo[i] = sc.nextInt();
		}
		int answer = 0;
		for(int i =0;i < 1 <<switchCount;i++) {
			for(int j =0; j < lampCount;j++) {
				int switchOnCount = 0;
				for(int k =0; k < switchInfo.get(j).length;k++) {
					if((1 & (i >> (switchInfo.get(j)[k] -1))) == 1 ) {
						switchOnCount++;
					}
				}
				if(switchOnCount % 2 != onOffInfo[j]) {
					break;
				}
				if(j ==lampCount-1) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}