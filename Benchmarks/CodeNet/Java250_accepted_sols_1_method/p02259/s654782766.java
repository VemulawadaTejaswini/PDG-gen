import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	String[] input = scan.nextLine().split(" ");
	int[] elements = new int[n];
	for (int i = 0; i < n; i++) {
	    elements[i] = Integer.parseInt(input[i]);
	}
	int cnt = 0;
	boolean flag = true;
	while (flag) {
	    flag = false;
	    for (int i = n-1; i > 0; i--) {
		if (elements[i] < elements[i-1]) {
		    int tmp = elements[i];
		    elements[i] = elements[i-1];
		    elements[i-1] = tmp;
		    cnt++;
		    flag = true;
		}
	    }
	}
        for (int i = 0; i < n-1; i++){
	    System.out.print(elements[i] + " ");
	}
	System.out.println(elements[n-1]);
	System.out.println(cnt);
    }
}