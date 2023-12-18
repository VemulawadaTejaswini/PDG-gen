import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		Main mySystem = new Main();
		int n = scan.nextInt();
		int s = scan.nextInt();
		while(n != 0 || s != 0){
			if(s > 45){
				System.out.println("0");
			}else{
				System.out.println(mySystem.search(0, 0, 0, s, n, 9));
				//int a = mySystem.puras(num+1 , sum , cnt+1 , s , n)+mySystem.puras(num+1 , sum , cnt , s , n);
			}
			n = scan.nextInt();
			s = scan.nextInt();
		}
	}
	public int search(int num , int sum , int cnt, int target, int maxcount, int maxvalue){
		if(sum == target && cnt == maxcount){
			return 1;
		}else if(num > maxvalue || sum > target || cnt > maxcount){
			return 0;
		}
		
		return search(num+1,sum+num,cnt+1,target,maxcount,maxvalue)+search(num+1,sum,cnt,target,maxcount,maxvalue);
		
		
	}
}