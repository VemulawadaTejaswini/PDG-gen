import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		String[] inputStrArray = inputStr.split(" ");
		int A = Integer.parseInt(inputStrArray[0]);
		int B = Integer.parseInt(inputStrArray[1]);
		int sum = A + B;
		int dif = A - B;
		int multi = A * B;
		int ans;
		if(sum>dif){
			if(sum>multi){
				ans = sum;
			}else{
				ans = multi;
			}
		}else{
			if(dif>multi){
				ans = dif;
			}else{
				ans = multi;
			}
		}
		System.out.println(ans);
	}
}