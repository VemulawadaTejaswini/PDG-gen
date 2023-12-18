import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int space = sc.nextInt();
			int type = sc.nextInt();
			Integer[] shelf = new Integer[space];
			int[] count = new int[type];
			for (int i=0; i<space; i++) {
				int j =sc.nextInt();
				shelf[i]=j;
				count[j-1]++;
			}
			List<Integer> num = new ArrayList<Integer>(type);
			for (int i=0; i<type; i++) num.add(i);
			int now = type;
			int min = 0;
			int pointer = 0;
			while (now>1) {
				double[][] data = new double[now][2];
				double dmax = -1;
				int dposit = -1;
				for (int i=0; i<now; i++) {
					double diff = 0;
					List<Integer> c = Arrays.asList(Arrays.copyOfRange(shelf, pointer, pointer+count[num.get(i)]));
					List<Integer> copy = new ArrayList<Integer>();
					copy.addAll(c);
					if (c.contains(num.get(i)+1)) {
						Collections.sort(c);
						int same = c.lastIndexOf(num.get(i)+1)-c.indexOf(num.get(i)+1)+1;
						//System.out.println(same + "   " + c.lastIndexOf(a+1) +" / " +  c.indexOf(a+1));
						diff+=count[num.get(i)]-same;
					} else diff += count[num.get(i)];
					data[i][0] = (count[num.get(i)] - diff)/count[num.get(i)];  //割り合い
					//System.out.println(data[i][0] );
					data[i][1] = diff;
					if (data[i][0] > dmax) {
						dmax = data[i][0];
						dposit = i;
					}
				}
				pointer += count[num.get(dposit)];
				min += data[dposit][1];
				num.remove(dposit);
				now--;
			}
			//最後の羅列
			List<Integer> c = Arrays.asList(Arrays.copyOfRange(shelf, pointer, pointer+count[num.get(0)]));
			List<Integer> copy = new ArrayList<Integer>();
			copy.addAll(c);
			if (c.contains(num.get(0)+1)) {
				Collections.sort(c);
				int same = c.lastIndexOf(num.get(0)+1)-c.indexOf(num.get(0)+1)+1;
				min+=count[num.get(0)]-same;
			} else min += count[num.get(0)];
			//--------------------------------------------------
			System.out.println(min);
		}
	}
}

