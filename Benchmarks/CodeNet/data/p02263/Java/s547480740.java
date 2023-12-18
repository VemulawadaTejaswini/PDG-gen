import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 逆ポーランド記法で与えられた数式の計算結果を出力

 class Main {
	public static void cal(int i, int[] a,String op) {
		switch(op) {
		case "+" :
			a[i-1]=a[i-1]+a[i];
			a[i]=0;
			break;
		case "-" :
			a[i-1]=a[i-1]-a[i];
			a[i]=0;
			break;
		case "*" :
			a[i-1]=a[i-1]*a[i];
			a[i]=0;
			break;
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String op = null;
		int[] r = new int [100];
		int j = 0;
		String a = stdIn.nextLine();
		
		String[] copy = a.split(" ");
		for(int i = 0; i < copy.length;i++) {
			try {
				r[j] = Integer.parseInt(copy[i]);
				j++;
				
			}catch(NumberFormatException e) {
				op = copy[i];
				j--;
				cal(j, r, op);
			}
		}
		System.out.println(r[0]);
	}
}

