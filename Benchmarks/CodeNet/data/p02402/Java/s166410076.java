import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // ??´??°?????° n
		int i;
		int min = 100000,max = -100000,sum = 0;
		for(i = 0;i < n;i++){
			int num = scan.nextInt(); // ??´??°??\???
			sum += num;
			if(min > num){min = num;}
			if(max < num){max = num;}
		}
	System.out.println(min + " " + max + " " + sum);
	}
}