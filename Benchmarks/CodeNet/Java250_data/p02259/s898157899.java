import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		int[] arrays;
		int youso=0;
		int counter=0;
		try {
			str=bfr.readLine();
			youso=Integer.parseInt(str);
			arrays=new int[youso];

			str=bfr.readLine();
			stk=new StringTokenizer(str," ");

			while(stk.hasMoreTokens()) {
				arrays[counter]=Integer.parseInt(stk.nextToken());
				counter++;
			}
			Bubble(arrays);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	static void Bubble(int[] a) {
		int tmp1,tmp2=0;
		int ookisa=a.length;
		int kaisu=0;

		for(int i=0; i<ookisa-1; i++) {
			for(int j=ookisa-1; j>=i+1; j--) {
				if(a[j]<a[j-1]) {
					tmp1=a[j];
					tmp2=a[j-1];
					a[j]=tmp2;
					a[j-1]=tmp1;
					kaisu++;
				}
			}
		}
		String moji="";
		for(int i=0; i<ookisa-1; i++) {
			moji=moji+a[i]+" ";
		}
		moji=moji+a[ookisa-1];
		System.out.println(moji);
		System.out.println(kaisu);


	}
}


