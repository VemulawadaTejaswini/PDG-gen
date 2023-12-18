import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
	public static int typeList[];
	public static int types;
	public static int minCount;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int change, i;
		change = sc.nextInt();
		types = sc.nextInt();
		
		typeList = new int[types];
		for(i = 0; i < types; i++){
			typeList[i] = sc.nextInt();
		}
		minCount = change / typeList[types - 1] + change % typeList[types - 1];
		
		Main.check(change, 0, types - 1);
		System.out.println(minCount);
	}
	public static void check(int remChanges, int count, int typeIndex){
		if(typeIndex == 0){
			// type must be 1
			if(remChanges + count < minCount){
				minCount = remChanges + count;
				//System.out.println(minCount);
			}
			return;
		}
		int tmp, uses;
		for(uses = remChanges / typeList[typeIndex]; uses >= 0; uses--){
			tmp = uses * typeList[typeIndex];
			if(tmp == remChanges){
				if(tmp < minCount){
					minCount = remChanges + count;
					//System.out.println(minCount);
				}
				return;
			}
			Main.check(remChanges - tmp, count + uses, typeIndex - 1);
		}
		return;
	}
}