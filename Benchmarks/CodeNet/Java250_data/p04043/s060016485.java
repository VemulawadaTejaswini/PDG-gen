import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String[] values = sc.nextLine().split(" ");
      	int countFor7 = 0;
      	int countFor5 = 0;
      	
      	for(String value: values) {
      		if ("7".equals(value)) {
				countFor7++;
			}else if("5".equals(value)) {
				countFor5++;
			}
      	}
      	
      	System.out.println((countFor5 == 2 && countFor7 == 1)? "YES": "NO");
      
	}

}
