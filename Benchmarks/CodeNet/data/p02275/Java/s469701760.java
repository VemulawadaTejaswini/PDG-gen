import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//Date allFrom = new Date();
		// TODO ?????????????????????????????????????????????
		Date inputFrom = new Date();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] tmpArray = br.readLine().split(" ");
		int[] array = new int[n];
		int l;
		for(l = 0; l < n; l++){
			//array[i] = Integer.parseInt(tmpArray[i]);
			array[l] = nextInt(tmpArray[l]);
		}

		Date inputTo = new Date();
		//System.out.println("input takes " + (inputTo.getTime() - inputFrom.getTime()) + "milli sec");
		//?????§???????´¢
		int k = 0;

		for(int i = 0; i < n; i++){
			if(k < array[i]){
				k = array[i];
			}
		}
		//Date from = new Date();
		int[] output = CountingSort(array, k);
		//Date to = new Date();

		//System.out.println("sort takes " + (to.getTime() - from.getTime()) + "milli sec");

		//from = new Date();
		StringBuilder sb = new StringBuilder(output.length * 5 / 2);
		int outLen = output.length;
		sb.append(output[0]);
		for(int i = 1; i < outLen ; i++){
			//System.out.print(output[i]);
			sb.append(" "+output[i]);
			//if(i != outLen - 1){
				//System.out.print(" ");
				//sb.append(" ");
			//}
		}
		System.out.println(sb);
		//System.out.println();
		//to = new Date();

		//System.out.println("print takes " + (to.getTime() - from.getTime()) + "milli sec");

		//Date AllTo = new Date();
		//System.out.println("all takes " + (AllTo.getTime() - allFrom.getTime()) + "milli sec");

	}

	public static int nextInt(String input) {
        int len = input.length();
        int n = 0;
        boolean minus = false;
        int b = input.charAt(0);

        int i =0;
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(i < len){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else{
                throw new NumberFormatException();
            }
            i++;
            if(i != len){
            	b = input.charAt(i);
            }
        }

        return n;
    }
	static int[] CountingSort(int[] input, int k){
		int[] output = new int[input.length];
		int[] count = new int[k + 1];
		Arrays.fill(count, 0);

		for(int j = 0; j < input.length ;j++){
			count[input[j]]++;
		}

		for(int i = 1; i <= k ; i++){
			count[i] = count[i] + count[i - 1];
		}

		for(int j = input.length - 1; j >= 0 ; j--){
			output[count[input[j]] - 1] = input[j];
			count[input[j]]--;
		}

		return output;
	}
}