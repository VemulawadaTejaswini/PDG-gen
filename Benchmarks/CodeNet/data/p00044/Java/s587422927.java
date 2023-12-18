import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int std = in.nextInt();
			int[] search = new int[std+100];
			double limit = Math.sqrt(std);
			for(int i=0; i<search.length; i++) {
				search[i] = i+2;
			}
			for(int i=0; i<search.length; i++) {
				if(search[i] > limit) break;
				if(search[i] != -1) {
					for(int j=i+1; j<search.length; j++) {
						if(search[j] % search[i] == 0) {
							search[j] = -1;
						}
					}
				}
			}
			int max=0, min=0;
			for(int i=0; i<search.length; i++) {
				if(search[i] != -1) {
					if(search[i] < std) max = search[i];
					if(search[i] > std) {
						min = search[i];
						break;
					}
				}
			}
			System.out.println(max + " " + min);
		}
	}
}