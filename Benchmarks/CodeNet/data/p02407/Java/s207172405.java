package internship;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Array {
	//HOME- ITP1-ITP1_6-A
	public static void main(String[] args) {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		//Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(br.readLine());

		String day[] =  br.readLine().split(" ");

		for (int i = 0; i < day.length; i++) {

			sb.append(day[i]);

			//System.out.print(day[i]);
		}
		 for (int i = n - 1; i >= 0; i--) {
	            sb.append(day[i]);
	            if (i != 0) {
	                sb.append(" ");
	            }
	            System.out.println(sb);
	        }
	    }