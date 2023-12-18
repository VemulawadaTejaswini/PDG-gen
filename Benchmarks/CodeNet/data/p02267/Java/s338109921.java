import java.util.*;

class Main {
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int[] arryS;
		int[] arryT;
		int sSize;
		int tSize;
		int sentinel;

		sSize = scan.nextInt();
		arryS = new int[sSize];
		for(int s = 0; s < sSize; s++){
			arryS[s] = scan.nextInt();
		}

		tSize = scan.nextInt();
		arryT = new int[tSize];
		for(int t = 0; t < tSize; t++){
			arryT[t] = scan.nextInt();
		}

		for(int i = 0; i < tSize; i++){
			for(int n = 0; n <sSize; n++){
			    if(arryT[i] == arryS[n]){
			        count++;
			        break;
			    }
			}
		}
		System.out.println(count);
	}
}

