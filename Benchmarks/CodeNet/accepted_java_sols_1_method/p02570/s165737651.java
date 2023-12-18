import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String scLine = sc.nextLine();

        double[] incomingDouble = new double[3];
        int first = scLine.indexOf(" ");
        int second = scLine.lastIndexOf(" ");
        double current = 0;

        incomingDouble[0] = Double.parseDouble(scLine.substring(0, first));
        incomingDouble[1] = Double.parseDouble(scLine.substring(first + 1, second));
        incomingDouble[2] = Double.parseDouble(scLine.substring(second + 1));

        if(Math.ceil(incomingDouble[0]/incomingDouble[2]) <= incomingDouble[1]){
            System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
	}
}
