import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

      	int party = sc.nextInt();
      	int num[] = new int[party];
      	int total = 0;
      	int mul;
      
      	for(int i = 0; i < party; i++) {
        	num[i] = sc.nextInt();
        }
      
      	for(int i = 1; i < party; i++) {
          mul = 0;
          for(int j = 0; j < i; j++) {
            int x = 0;
          	if(num[j] > num[i]) { 	
              	x = num[j] - num[i];
            }
            if(x > mul) {
	            mul = x;
            }
          }
          total += mul;
        }
      
     	 System.out.println(total);
    }
}