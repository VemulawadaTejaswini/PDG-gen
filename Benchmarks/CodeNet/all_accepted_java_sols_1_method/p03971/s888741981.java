import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {//注意while处理多个case
        	int N = in.nextInt();
        	int A = in.nextInt();
        	int B = in.nextInt();
        	String participants = in.nextLine();
        	participants = in.nextLine();
        	int totNum = 0;
        	int overseas = 0;
        	for(int i = 0; i < participants.length(); i++){
        		if (participants.charAt(i) == 'c') {
					System.out.println("No");
				}else if (participants.charAt(i) == 'a') {
					if (totNum < A + B) {
						++totNum;
						System.out.println("Yes");
					}else{
						System.out.println("No");
					}
				}else {
					if (totNum < A+B && overseas < B) {
						System.out.println("Yes");
						++totNum;
						++overseas;
					}else{
						System.out.println("No");
					}
				}
        	}
        }
        in.close();
    }
}