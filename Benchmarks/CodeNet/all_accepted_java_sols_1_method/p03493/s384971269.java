import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);

        char array[] = new char[3];
        String s = scan.next();
        int counter = 0;
        
        array[0] = s.charAt(0);
        array[1] = s.charAt(1);
        array[2] = s.charAt(2);

        for(int i =0; i < array.length; i++) {
        	if(array[i] == '1') {
        		counter += 1;
        	}
        }
        
        System.out.println(counter);
        
	}

}