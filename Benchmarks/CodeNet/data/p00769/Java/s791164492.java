import java.util.*;

public class Main{
	static String str;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		for(int i=0; i<data; i++){
			str = sc.next();
			System.out.println(DFS(0, str.length()-1));
		}
	}

	static int DFS(int left, int right){
		left++;
		if(str.charAt(left)>='0'&&str.charAt(left)<='9'){
			return Get_num(left);
		}

		int[] phase = new int[3333];
		int count = 0;
		int balance = 0;

		for(int i=left; i<right; i++){
			if(str.charAt(i)=='['){
				balance++;
			}else if(str.charAt(i)==']'){
				balance--;
				if(balance==0){
					phase[count++] = DFS(left, i);
					left = i + 1;
				}
			}
		}

		Arrays.sort(phase, 0, count);
		int sum = 0;

		for(int i=0; i<count/2+1; i++){
			sum += phase[i];
		}

		return sum;
	}

	static int Get_num(int n){
		int temp = 0;
		while(str.charAt(n)>='0'&&str.charAt(n)<='9'){
			temp = 10*temp + (str.charAt(n++) - '0');
		}
		return temp/2+1;
	}
}