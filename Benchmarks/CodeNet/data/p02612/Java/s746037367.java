import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String N2 = N.substring(N.length() - 3);
      	int i = new Integer(N2).intValue();
      	if(i == 0){
          System.out.println(i);
        }
      	else {
        	System.out.println(1000 - i);
        }
    }
}