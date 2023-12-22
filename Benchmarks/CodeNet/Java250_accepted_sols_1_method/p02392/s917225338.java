import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = (int)Integer.parseInt(sc.next());
    	int b = (int)Integer.parseInt(sc.next());
    	int c = (int)Integer.parseInt(sc.next());
    	if(a<b && b<c){
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
		}
    }
}

