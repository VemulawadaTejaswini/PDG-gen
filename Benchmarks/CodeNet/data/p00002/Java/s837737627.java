import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] a){
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		String input;
		try {
            while (scanner.hasNextLine()){
            	
                input = scanner.nextLine();
                if (input.equals("")) {
            		break;
            	}
                list.add(input); 
            }
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