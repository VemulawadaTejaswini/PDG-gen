import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int questions = sc.nextInt();
		int firstBorder = sc.nextInt();
		int secondBorder = sc.nextInt();
		int firstQuestions = 0;
		int secondQuestions = 0;
		int thirdQuestions = 0;
		for(int i = 0; i < questions; i++) {
			int point = sc.nextInt();
			if (point <= firstBorder) {
				firstQuestions++;
			} else if (point <= secondBorder) {
				secondQuestions++;
			} else {
				thirdQuestions++;
			}
		}
		int min = Math.min(Math.min(firstQuestions, secondQuestions), thirdQuestions);
		System.out.println(min);
	}
}