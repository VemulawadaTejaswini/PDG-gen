
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	private static final double[] time500M  = {-1, 35.50,  37.50,  40.00,  43.00,  50.00,  55.00,  70.00, Double.MAX_VALUE};
	private static final double[] time1000M = {-1, 71.00,  77.00,  83.00,  89.00, 105.00, 116.00, 148.00, Double.MAX_VALUE};
	private static final String[] rankName = {"", "AAA", "AA", "A", "B", "C", "D", "E", "NA"};

	private static final int binSearch(double[] list, double val) {
		int min=0;
		int max=list.length-1;
		int mid=(min+max)/2;
		while(mid!=min) {
			if(list[mid]>val)
				max=mid;
			else
				min=mid;
			mid=(min+max)/2;
		}
		return max;
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LinkedList<Integer> res=new LinkedList<Integer>();

		String line=br.readLine();
		while(line!=null&&line.length()!=0) {
			String[] strArray=line.split(" ");
			double t5=Double.parseDouble(strArray[0]);
			double t1=Double.parseDouble(strArray[1]);
			int r5=binSearch(time500M, t5);
			int r1=binSearch(time1000M, t1);

			int rank=r5>r1?r5:r1;
			res.add(rank);

			line=br.readLine();
		}

		br.close();

		for(int val: res)
			System.out.println(rankName[val]);
	}
}