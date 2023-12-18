import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
	public static int contCount = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int change, types, i, min;

		change = sc.nextInt();
		types = sc.nextInt();
		
		int typeList[] = new int[types];
		for(i = 0; i < types; i++){
			typeList[i] = sc.nextInt();
		}
		
		min = Main.check(typeList, types, change, 0, change / typeList[types - 1] + change % typeList[types - 1]);
		System.out.println(min);
	}
	public static int check(int typeList[], int types, int remChanges, int count, int minCount){
		int i, tmp;
		if(contCount > 100000000){
			return minCount;
		}
		if(remChanges == 0){
			return count;
		}
		if(count >= minCount || remChanges <= 0){
			contCount++;
			return minCount;
		}
		for(i = types - 1; i >= 0; i--){
			tmp = Main.check(typeList, types, remChanges - typeList[i], count + 1, minCount);
			if(tmp < minCount){
				minCount = tmp;
				if(count + 1 == minCount){
					contCount = 0;
					System.out.println(minCount + "," + count + "," + i);
				}
			}
		}
		return minCount;
	}
}