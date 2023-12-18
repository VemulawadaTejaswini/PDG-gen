import java.util.*;
public class Main {
	private int getResult(int i, int j,int n){
		int result = i - j;
		if(result < 0)
			result += n;
		if(result > (n-1) / 2)
			result = n - result;
		return result;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int len;
		while(true){
			int n = sc.nextInt();
			if(n==0)
				break;
			ts.clear();
			for(int i=1; i < n; i++){
				ts.add((i*i)%n);
			}
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.addAll(ts);
			int [] list = new int[(n-1)/2 + 1];
			len = al.size();
			for(int i=0; i < len;i++){
				for(int j=i+1; j < len;j++){
					int num1 = al.get(i);
					int num2 = al.get(j);
					list[getResult(num1, num2, n)]++;
					list[getResult(num2, num1, n)]++;
				}
			}

			//print
			len = list.length;
			for(int i=1; i < len; i++)
				System.out.println(list[i]);
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}