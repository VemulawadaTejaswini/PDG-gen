import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
        while(true){
            int input = sc.nextInt();
            if(input == 0){
                break;
            }
            System.out.println("Case "+i+": "+input);
            i++;
        }

	}
}
