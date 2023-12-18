import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] a){
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		Integer input;
		
		try {
			int countInput = 0;
			while (scanner.hasNextInt()){
            	if (countInput >= 30) {break;}
                input = scanner.nextInt();
                
               
                if (input > 0 && input < 999999) {
                	list.add(input);
                }
                countInput++;
            }
		}catch (Exception e) {
        	System.err.println("wrong format");
       
        } finally {
            scanner.close();
        }
		
		
		int prime,num,div;
		for (Integer inputList : list) {
			num = inputList.intValue();
			prime = 0;
			for (int i = 2; i <= num; i++) {
				div = 0;
				for (int j = 2; j <= i; j++) {
					if (i % j == 0) {
						div++;
					}
				}
				if (div == 1) {
					prime++;
				}
			}
			
			System.out.println(prime);
		}
		
	}
}