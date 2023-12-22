import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long ans1 = 0;
		long ans2 = 0;
		int problems = sc.nextInt();
		int submissions = sc.nextInt();
		int[] solved = new int[problems+1];
		int[] penalty = new int[problems+1];

		for(int i=0; i<submissions; i++) {
			int submit = sc.nextInt();
			String result = sc.next();

			if(submit <= problems) {
				if(solved[submit] == 1) {
					continue;
				} else if(result.equals("AC")) {
					 ans1++;
					 ans2 += penalty[submit];
					 solved[submit] = 1;
				} else if(result.equals("WA")) {
					penalty[submit] += 1;
				}
			}
		}

		System.out.println(ans1 + " " + ans2);





		// Scanner sc = new Scanner(System.in);
		// Queue<Integer> q1 = new LinkedList<Integer>();
		// Queue<String> q2 = new LinkedList<String>();

		// long ans1 = 0;
		// long ans2 = 0;
		// int problems = sc.nextInt();
		// int submissions = sc.nextInt();
		// int[] solved = new int[problems+1];

		// for(int i=0; i<submissions; i++) {
		// 	int submit = sc.nextInt();
		// 	String result = sc.next();
		// 	// System.out.println(result);

		// 	if(q1.isEmpty() || q1.peek() == submit) {
		// 		q1.add(submit);
		// 		q2.add(result);
		// 	} else {
		// 		while(!q1.isEmpty()) {
		// 			int subVal = q1.remove();
		// 			String resVal = q2.remove();
		// 			if(resVal.equals("AC")) {
		// 				if(subVal <= problems && solved[subVal] == 0) { 
		// 					ans1++;
		// 					solved[subVal] = 1;
		// 				}
		// 				while(!q1.isEmpty()) {
		// 					q1.remove();
		// 					q2.remove();
		// 				}
		// 				// System.out.println("Emptied.");
		// 			} else {
		// 				ans2++;
		// 			}
		// 		}

		// 		q1.add(submit);
		// 		q2.add(result);
		// 	}
		// }

		// while(!q1.isEmpty()) {
		// 	int subVal = q1.remove();
		// 	String resVal = q2.remove();
		// 	if(resVal.equals("AC")) {
		// 		if(subVal <= problems && solved[subVal] == 0) { 
		// 			ans1++;
		// 			solved[subVal] = 1;
		// 		}
		// 		while(!q1.isEmpty()) {
		// 			q1.remove();
		// 			q2.remove();
		// 		}
		// 		// System.out.println("Emptied.");
		// 	} else {
		// 		ans2++;
		// 	}
		// }

		// System.out.println(ans1 + " " + ans2);
	}
}