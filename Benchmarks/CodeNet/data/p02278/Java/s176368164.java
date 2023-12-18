import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static int cost = 0;
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		//int costA = 0;
		//int costB = 0;
		int tmp = br.read();
		while(tmp != 13 && tmp != 10){
			n = n * 10 + (tmp - '0');
			tmp = br.read();
		}

		int[] array = new int[n];
		int[] sortedArray = new int[n];
		int num = 0;
		int i1 = 0;
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		tmp = br.read();
		if(tmp == 13 || tmp == 10){
			tmp = br.read();
		}
		while(tmp != -1 && tmp != 10 && tmp != 13){
			num = 0;
			while(tmp >= '0' && tmp <= '9'){
				num = num * 10 + (tmp - '0');
				tmp = br.read();
			}
			if(tmp == -1){
				break;
			}
			array[i1] = num;
			sortedArray[i1] = num;
			if(min > num){
				min = num;
				minIndex = i1;
			}
			i1++;
			tmp = br.read();
		}

		Arrays.sort(sortedArray);
		int[] trueIndex = new int[n];
		for(int i = 0; i < n; i++){
			trueIndex[i] = Arrays.binarySearch(sortedArray, array[i]);
		}

		//??????????????¢???
		boolean[] checked = new boolean[n];
		Arrays.fill(checked, false);

		for(int i = 0; i < n ; i++){
			if(i == trueIndex[i] || checked[i] == true){
				continue;
			}
			ArrayList<Integer> cycle = new ArrayList<Integer>();
			cycle.add(array[i]);
			int j = trueIndex[i];
			while(j != i){
				checked[j] = true;
				cycle.add(array[j]);
				j = trueIndex[j];
			}

			//????????????????°?????????§??????????????????????????????????¨??¨????
			int minInCycle = cycle.get(0);
			int costA = 0;
			int costB = 0;
			for(int k = 0; k < cycle.size(); k++){
				if(minInCycle > cycle.get(k)){
					minInCycle = cycle.get(k);
				}
				costA+=cycle.get(k);
				costB+=cycle.get(k);
			}
			costA += minInCycle*(cycle.size() - 2);
			costB += minInCycle + min*(cycle.size() + 1);

			cost += Math.min(costA, costB);

		}


		//quickSort(array, 0, array.length - 1);

		System.out.println(cost);
		/*
		StringBuilder sb = new StringBuilder(array.length * 5 / 2);
		int outLen = array.length;
		sb.append(array[0]);
		for(int i = 1; i < outLen ; i++){
			sb.append(" "+array[i]);

		}
		System.out.println(sb);
		*/
	}
	/*
	static void quickSort(int[] array, int p, int r){
		if(p < r){
			int q = partition(array, p, r);
			quickSort(array, p, q - 1);
			quickSort(array, q + 1, r);
		}
	}*/
	/*
	static int partition(int[] array, int p, int r){
		int x = array[r];
		int i = p - 1;
		for(int j = p ; j <= r -1 ;j++){
			if(array[j] <= x){
				i++;
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;

			}
		}

		if(true || array[i + 1] != array[r]){
			cost += array[i + 1] + array[r];
			System.out.println("add cost " +array[i + 1]+" " + array[r]);
		}
		int tmp = array[i + 1];
		array[i + 1] = array[r];
		array[r] = tmp;
		return i + 1;
	}
	*/
}