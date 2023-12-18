package aizu.online.jp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0188
 *
 *
 */
class Main{
    public static void main(String[] a) throws IOException{

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

        	while(true) {
	            String line1 = br.readLine();
	            if (line1 == null) {return;}
	            int N = Integer.parseInt(line1);
	            if (N == 0) {return;}

	            int[] dataset = new int[N];
	            for (int i=0; i<N; i++) {
	            	String line = br.readLine();
	            	if (line == null) {return;}
	            	dataset[i] = Integer.parseInt(line);
	            }

	            int K = 0;
	            {
	            	String line = br.readLine();
	            	K = Integer.parseInt(line);
	            }

	            search(dataset, K);

	            System.out.println(count);
	            count = 0;
        	}


        }


    }


    private static int count = 0;

    /**
     * ?????°
     * @param dataset
     * @param K
     * @return
     */
  private static void search(int[] dataset, int K) {
	int medianIndex = (0 + dataset.length-1) / 2;
	int median = dataset[medianIndex];

	if (K == median) {
		count++;
		//none
	} else if (K < median){
		int[] newdataset = Arrays.copyOfRange(dataset, 0, medianIndex);
		count++;
		if (newdataset.length == 0) {return;}
		search(newdataset, K);

	} else if (K > median) {
		int[] newdataset = Arrays.copyOfRange(dataset, medianIndex+1, dataset.length);
		count++;
		if (newdataset.length == 0) {return;}
		search(newdataset, K);
	}
  }




}