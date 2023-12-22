import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int monsterCount = sc.nextInt();
		int hissatuCount = sc.nextInt();
		long tairyokuList[] = new  long[monsterCount];
		long kougekiCount = 0;
		for(int i= 0; i<monsterCount;  i++) {
			tairyokuList[i] = sc.nextInt();
		}
		Arrays.sort(tairyokuList);
		if(monsterCount< hissatuCount) {
			hissatuCount = monsterCount;
		}
		for(int i=0; i<hissatuCount; i++) {
			tairyokuList[tairyokuList.length-1-i] = 0;
		}
		for(int i= 0; i<monsterCount;  i++) {
			kougekiCount = kougekiCount + tairyokuList[i];
		}
		System.out.println(kougekiCount);
	}
}