import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long s = 0;
        long s2 = 0;
        for (int a=0; a<=A; a++) {
        	if(a % 3 == 0 || a % 5 == 0){
        		s2 = a + s2;
        	}
        	else {
        		s = a + s;
        	}
        }
        System.out.println(s);
    }
}