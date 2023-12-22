import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
        int[] n = new int[x];
        
        for(int i=0; true; i++){
        	n[i] = scan.nextInt();
        	if(i == x-1) break;
        }
        for(int i=x-1; true; i--){
        	System.out.print(n[i]);
        	if(i == 0) break;
        	System.out.print(" ");
        }
    	System.out.println();
	}

}