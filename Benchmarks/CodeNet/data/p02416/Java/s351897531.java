import java.util.Scanner;
public class Main {
    public static void main(String[] defargs) {
        Scanner scanner = new Scanner(System.in);
        while(true){
		int sum = 0;
		String a= scanner.next();
		if(a.equals("0")){
		    break;
		}
		for(int i = 0; i < a.length(); i++){
			sum += a.charAt(i)-'0';
		    }
		System.out.println(sum);
	    }
    }
}
