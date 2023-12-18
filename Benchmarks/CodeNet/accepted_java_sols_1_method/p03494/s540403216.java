import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		String[] aString = sc.nextLine().split(" ");
		byte count = 0;
		boolean flag = true;
		List<Integer> a = new ArrayList<>();

		do{
			if(aString!=null){
				for(int i=0;i<n;i++){
					a.add(Integer.parseInt(aString[i]));
				}
				aString = null;
			}
			for(int i = 0;i < n;i++){
				int target = a.get(i);
				if(target % 2 != 0){
					flag = false;
					break;
				}
				a.set(i, target/2);
			}
			if(flag){
				count++;
			}
		}while(flag);

		System.out.println(count);
	}
}
