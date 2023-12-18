
import java.util.*;
public class Main {
	HashMap<Character,Integer> map;

	private int getSum(String str){
		int sum = 0;
		for(int i=0; i < str.length(); i++){
			int res = str.charAt(i) - '0';
			if (res  >= 0 && res <= 9) {
				 sum += map.get(str.charAt(++i)) * res;
			}
			else{
				res = 1;
				sum += map.get(str.charAt(i)) * res;
			}
		}
		return sum;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		map = new HashMap<Character, Integer>();
		map.put('m', 1000);
		map.put('c', 100);
		map.put('x', 10);
		map.put('i', 1);
		char [] list = {'i','x','c','m'};
		while (n-- > 0){
			String str1 = sc.next();
			String str2 = sc.next();
			int sum1 = getSum(str1);
			int sum2 = getSum(str2);
			int sum = sum1 + sum2;

			//decode
			ArrayList<Character> al = new ArrayList<Character>();
			int len = ("" + sum).length();
			for(int i =0; i < len ; i++){
				if(sum %10 == 0){

				}
				else if(sum % 10 == 1){
					al.add(list[i]);
				}
				else{
					al.add(list[i]);
					al.add(("" + sum%10).charAt(0));
				}
				sum = sum / 10;
			}
			//print
			for(int i=al.size()-1; i >= 0;i--){
				System.out.print(al.get(i));
			}
			System.out.println("");
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}