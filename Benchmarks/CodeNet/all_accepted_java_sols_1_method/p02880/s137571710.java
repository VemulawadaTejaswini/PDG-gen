//package ac144;
import java.lang.*;
import java.math.*;
import java.util.Scanner;
import java.io.*;
public class Main {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= scn.nextInt();
		boolean flag = false;
		for(int i =1;i<=9;i++) {
			if(x%i==0) {
				int on = x/i;
				if(on<=9&&on>=1) {
					flag = true;
				}
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
