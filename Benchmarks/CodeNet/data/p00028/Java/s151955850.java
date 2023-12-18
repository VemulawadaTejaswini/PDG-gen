package AOJ0028;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	final int N = 100;
	int[] modList = new int[N];
	for (int i = 0; i < N; i++) {
		modList[i] = 0;
		}
	
	try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			int n = Integer.parseInt(str);
			modList[n-1]++;
			}
		} catch (Exception e) {
		System.out.println(e);
		}
	
	int max = 0;
	for (int i = 0; i < N; i++) {
		if (max < modList[i]) max = modList[i];
		}
	for (int i = 0; i < N; i++) {
		if ( modList[i] == max) System.out.println(i+1);
		}
	}
}

