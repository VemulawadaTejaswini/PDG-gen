import java.util.Scanner;
 

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        String[] md1 = line.split(" ");
        
        line = sc.nextLine();
        String[] md2 = line.split(" ");
        
        int ret = md2[1].equals("1") ? 1 : 0;
        System.out.println(ret);

        sc.close();
	}
	
}
