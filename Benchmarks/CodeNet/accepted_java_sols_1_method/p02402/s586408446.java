import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        long sum = 0;

        for(int i = 0 ; i < n ; i++) {
        	int num = sc.nextInt();
        	if(min > num)min = num;
        	if(max < num)max = num;
        	sum += num;
        }

        System.out.println(min + " " + max + " " + sum);
        sc.close();
	}

}

