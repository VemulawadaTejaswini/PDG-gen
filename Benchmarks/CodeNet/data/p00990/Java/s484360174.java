import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	private static int calcCombineNum(int sum, int lack, int[] list) {
		// 計算
		int combiNum=(int)Math.pow(list.length, lack);
		int[] sums=new int[combiNum];
		Arrays.fill(sums, 0);
		for(int i=0; i<sums.length; i++) {
			int t=1;
			for(int j=0; j<lack; j++) {
				int index=(i/t)%list.length;
				sums[i]+=list[index];
				t*=list.length;
			}
		}
		// 判定
		int count=0;
		for(int i=0; i<sums.length; i++)
			if(sum==sums[i]%10)
				count++;
		return count;
	}

	private static int bai(int val) {
		return val>=5?(val-4)*2-1:2*val;
	}

	private static boolean isEven(int i, int length) {
		return (length-i)%2==0;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		/** IDの桁数 */
		int n;
		/** 入力されたID */
		int lackOdd=0, lackEven=0, sum=0;
		/** 数字の候補の数 */
		int m;

		// データ読み込み
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		char[] charArray=br.readLine().toCharArray();
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i]=='*')
				if(isEven(i, charArray.length))
					lackEven++;
				else
					lackOdd++;
			else
				if(isEven(i, charArray.length))
					sum+=bai(Integer.parseInt(charArray[i]+""));
				else
					sum+=Integer.parseInt(charArray[i]+"");
		}
		m=Integer.parseInt(br.readLine());
		String line=br.readLine();
		String[] strArray=line.split(" ");
		LinkedList<Integer> tempCandidate=new LinkedList<Integer>();
		for(int i=0; i<m; i++) {
			int tempNum=Integer.parseInt(strArray[i]);
			tempCandidate.add(tempNum);
		}
		br.close();

		// 求める
		int num=10-sum%10;
		num%=10;
//		System.out.println("num: "+num);
		int[] evenList=new int[tempCandidate.size()];
		int count=0;
		for(int val: tempCandidate)
			evenList[count++]=bai(val);
		int[] oddList=new int[tempCandidate.size()];
		count=0;
		for(int val: tempCandidate)
			oddList[count++]=val;

		count=0;
		for(int i=0; i<10; i++) {
			// (i+j)%10=numとなるjを作る
			int j=i<=num?(num-i):(num-i+10);
			// 偶数でiをつくり，奇数でjを作る
			int c1=calcCombineNum(i, lackEven, evenList);
			int c2=calcCombineNum(j, lackOdd, oddList);
			count+=c1*c2;
//			System.out.println("(i, j) = ("+i+", "+j+")\tc1="+c1+"\tc2="+c2);
		}

		// 出力
		System.out.println(count);

	}
}