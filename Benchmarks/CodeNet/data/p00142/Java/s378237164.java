
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int result,len;
		while(true){
			int n = sc.nextInt();
			if(n==0)
				break;
			ts.clear();
			for(int i=1; i < n; i++){
				ts.add((i*i)%n);
			}
			int [] list = new int[(n-1)/2 + 1];
			for(int i: ts){
				for(int j: ts){
					if(i== j)
						continue;
					result = i - j;
					if(result < 0)
						result += n;
					if(result > (n-1) / 2)
						result = n - result;
					list[result]++;
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