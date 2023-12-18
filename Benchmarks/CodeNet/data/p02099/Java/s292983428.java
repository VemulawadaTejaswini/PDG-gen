import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Person[] people = new Person[n];
		for (int i = 0; i < n; i++) {
		    people[i] = new Person(i, sc.nextDouble());
		}
		Arrays.sort(people);
		int[] topNums = new int[n];
		int[] botNums = new int[n];
		double prev = -1;
		int prevCount = 0;
		double next = Double.MAX_VALUE;
		int nextCount = n;
		for (int i = 0; i < n; i++) {
		    if (people[i].score == prev) {
		        topNums[i] = prevCount;
		    } else {
		        topNums[i] = i + 1;
		    }
		    prevCount = topNums[i];
		    prev = people[i].score;
		    if (people[n - i - 1].score == next) {
		        botNums[n - i - 1] = nextCount;
		    } else {
		        botNums[n - i - 1] = i + 1;
		    }
		    nextCount = botNums[n - i - 1];
		    next = people[n - i - 1].score;
		}
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
		    scores[people[i].idx] = (topNums[i] - 1) * 3 + n - (topNums[i] - 1) - (botNums[i] - 1) - 1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    sb.append(scores[i]).append("\n");
		}
		System.out.print(sb);
	}
	
	static class Person implements Comparable<Person> {
	    int idx;
	    double score;
	    
	    public Person(int idx, double score) {
	        this.idx = idx;
	        this.score = score;
	    }
	    
	    public int compareTo(Person another) {
	        if (score == another.score) {
	            return 0;
	        } else if (score < another.score) {
	            return -1;
	        } else {
	            return 1;
	        }
	    }
	}
}

