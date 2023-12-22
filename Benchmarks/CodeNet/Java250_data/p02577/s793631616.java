import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
            	
      	String kari = sc.next();
      	int num[] = new int[kari.length()];
      	int rt = 0;
      
      	for(int i = 0; i < kari.length(); i++) {
          num[i] = Integer.parseInt(kari.substring(i, i + 1));			
        }
            
      	for(int number : num) {
        	rt += number;
        }
      
      	if(rt % 9 == 0) {
      		System.out.println("Yes");
        } else {
      		System.out.println("No");
        }
    }
}