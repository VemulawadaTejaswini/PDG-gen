import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] a){
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		String input;
		try {
            while (scanner.hasNext()){
            	
                input = scanner.nextLine();
               
                if (input.equals("")) {
            		break;
            	}
                String[] arr = input.split(" ");
                if (arr.length != 2) {
                	System.out.println("wrong integer");
                	break;
                }
                int num1 = Integer.parseInt(arr[0]);
                int num2 = Integer.parseInt(arr[1]);
                if ( (num1 < 0 || num1 > 100000) || (num2 < 0 || num2 > 100000)) {
                	System.out.println("wrong integer");
                	break;
                }
                list.add(input); 
            }
		}catch (Exception e) {
        	System.err.println("wrong format");
       
        } finally {
            scanner.close();
        }
		
		char[] c;	
		int count,num;
		for (String inputList : list) {
			c = inputList.toCharArray();
			count = 0;
			for (int i = 0; i < c.length; i++) {
				num = Character.getNumericValue(c[i]);
				if (i < c.length && num > 0) {
					count += 1;
				}
			}
			System.out.println(count);
		}
		
	}
}