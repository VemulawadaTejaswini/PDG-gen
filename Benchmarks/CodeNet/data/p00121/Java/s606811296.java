import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		HashMap<Integer,Integer> states = new HashMap<Integer,Integer>(65536);
		int diff[] = new int[4096];
		int diff0[] = new int[4096];
		try {
			for(;;){
				buf = br.readLine();
				if(buf == null){
					break;
				}
				Scanner scanner = new Scanner(buf);
				if(!scanner.hasNext()){
					break;
				}
				int i, k;
				int initState = 0;
				int cMap, p0x, p0y, dLen, d0Len, d0Index;
				for(i = 0; i < 8; i++){
					initState |= scanner.nextByte() << (i * 3);
				}
				states.put(initState, 0);
				diff[0] = initState;
				dLen = 1;
				for(i = 0; ; i++){
					if(states.containsKey(0xFAC688)){
						System.out.println(states.get(0xFAC688));
						break;
					}
					System.arraycopy(diff, 0, diff0, 0, d0Len = dLen);
					dLen = 0;
					for(d0Index = 0; d0Index < d0Len; d0Index++){
						cMap = diff0[d0Index];
						p0x = 0;
						p0y = 0;
						for(k = 0; k < 8; k++){
							if(((cMap >>> (k * 3)) & 7) == 0){
								p0x = k % 4;
								p0y = k / 4;
								break;
							}
						}
						if(p0y == 1){
							if(states.putIfAbsent(k = Main.getExchanged(cMap, p0x, 0, p0x, 1), i+1) == null){
								diff[dLen++] = k;
							}
						} else{
							if(states.putIfAbsent(k = Main.getExchanged(cMap, p0x, 0, p0x, 1), i+1) == null){
								diff[dLen++] = k;
							}
						}
						if(p0x != 3){
							if(states.putIfAbsent(k = Main.getExchanged(cMap, p0x, p0y, p0x + 1, p0y), i+1) == null){
								diff[dLen++] = k;
							}
						}
						if(p0x != 0){
							if(states.putIfAbsent(k = Main.getExchanged(cMap, p0x, p0y, p0x - 1, p0y), i+1) == null){
								diff[dLen++] = k;
							}
						}
					}
				}
				states.clear();
				dLen = 0;
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
	public static int getExchanged(int org, int px, int py, int qx, int qy){
		int p, q;
		p = ((org >>> ((py * 4 + px) * 3)) & 7);
		q = ((org >>> ((qy * 4 + qx) * 3)) & 7);
		org &= ~(7 << ((py * 4 + px) * 3));
		org |= q << ((py * 4 + px) * 3);
		org &= ~(7 << ((qy * 4 + qx) * 3));
		org |= p << ((qy * 4 + qx) * 3);
		return org;
	}
	public static void printMap(int map){
		int i;
		System.out.println(Integer.toHexString(map));
		for(i = 0; i < 4; i++){
			System.out.print(((map >>> (i * 3)) & 7) + " ");
		}
		System.out.println();
		for(i = 4; i < 8; i++){
			System.out.print(((map >>> (i * 3)) & 7) + " ");
		}
		System.out.println();
		System.out.println();
	}
}