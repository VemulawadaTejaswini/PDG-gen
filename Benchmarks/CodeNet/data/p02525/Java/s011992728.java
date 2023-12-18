	import java.util.Scanner;
	public class main { 
	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in); 
	while (true) { 
	int n = sc.nextInt(); 
	if (n == 0) { break; } 
	int[] scores = new int[n]; 
	for (int i = 0; i < scores.length; i++) { 
	scores[i] = sc.nextInt(); 
	}
	double average = 0, variance = 0;
	average = scores.length / n ;
	
	for (int i=0; i<n; i++) {
        variance= ((scores.length-average)*(scores.length-average)) / n ;
	}

	System.out.println(average);
	System.out.println(Math.sqrt(variance)); 	
	}
	} 
	}