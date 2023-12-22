import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int R[] = new int[n];
	int max = (int)Math.pow(10,10)*(-1),min;
	for(int i = 0;i < n;i++){
	    R[i] = sc.nextInt();
	}
	min = R[0];
	for(int j = 1;j < n;j++){	    
	    max = Math.max(max,(R[j] - min));
	    min = Math.min(min,R[j]);
	}
       	System.out.println(max);
    }
}




