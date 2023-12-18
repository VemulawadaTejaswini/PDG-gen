import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for(int i = 3; i <= n; i ++){
			String str_i = String.valueOf(i);
			if(i % 3 == 0 || str_i.indexOf("3") != -1){
				System.out.print(" "+i);	
			}
		}
		System.out.println();
    	scanner.close();
    }
}