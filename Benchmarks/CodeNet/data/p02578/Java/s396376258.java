import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

      	int party = sc.nextInt();
      	int num[] = new int[party];
      	int total = 0;
      
      	for(int i = 0; i < party; i++) {
        	num[i] = sc.nextInt();
        }

      	int max = num[0];
      	for(int i = 1; i < party; i++) {
          if(max > num[i]) {
          	total += max - num[i];
          }
          max = Math.max(max, num[i]);
        }
      
        System.out.println(total);
    }
}