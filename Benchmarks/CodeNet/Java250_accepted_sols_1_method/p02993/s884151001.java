import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String[] array = N.split("");
        boolean ans = false;
        
        for(int i = 0 ; i < 3;i++) {
        	if(array[i].equals(array[i+1])) {
        		ans = true;
        		break;
        	}
        }
       System.out.println(ans?"Bad":"Good");
    }
}