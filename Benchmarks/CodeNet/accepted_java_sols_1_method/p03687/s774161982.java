import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] sSplit = s.split("");

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String[] alphabetSplit = alphabet.split("");

		int[][] distance = new int[alphabetSplit.length][sSplit.length+1];
		int[] distanceCnt = new int[alphabetSplit.length];
		int currentAlphabet;
		int prev;
		for(int i=0; i<alphabetSplit.length; i++){
			distanceCnt[i] = 0;
			prev = -1;
			for(int j=0; j<sSplit.length; j++){
				if(sSplit[j].equals(alphabetSplit[i])){
					distance[i][distanceCnt[i]++] = j - prev - 1;
					prev = j;
				}
			}
			distance[i][distanceCnt[i]] = sSplit.length - prev - 1;
		}

		int[] count = new int[alphabetSplit.length];
		int max;
		int last;
		int maxIndex = -1;
		boolean flg;
		for(int i=0; i<alphabetSplit.length; i++){
			if(distance[i][0]== sSplit.length){
				count[i] = Integer.MAX_VALUE;
			}else{
				max = 0;
				for(int j=0; j<distanceCnt[i]; j++){
					if(distance[i][j]>max){
						max = distance[i][j];
						maxIndex = j;
					}
				}
				last = distance[i][distanceCnt[i]];
				if(last>=max){
					count[i] = last;
				}else{
					count[i] = max;
					/*
					for(int k=0; k<distanceCnt[i]; k++){
						distance[i][k] -= last;
					}
					count[i] = last;
					while(true){
						for(int k=0; k<distanceCnt[i]; k++){
							distance[i][k] -= 1;
							if(distance[i][k]>distance[i][maxIndex]){
								maxIndex = k;
							}
						}
						distance[i][maxIndex] -=1;
						count[i]++;
						flg = true;
						for(int k=0; k<distanceCnt[i]; k++){
							if(distance[i][k]>0){
								flg = false;
								break;
							}
						}
						if(flg == true){
							break;
						}
					}
					*/
				}
			}
		}

		int min = Integer.MAX_VALUE;
		for(int i=0; i<alphabetSplit.length; i++){
			if(count[i]<min){
				min = count[i];
			}
		}

		System.out.print(min);

	}

}
