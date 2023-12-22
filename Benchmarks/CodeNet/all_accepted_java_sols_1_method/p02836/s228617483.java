import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
        int ll = s.length();
        int l = s.length() / 2;
        int count = 0;
        for (int i=0; i<l; i++) {
            if (
              !s.substring(i, i+1)
                .equals(s.substring(ll-i-1, ll-i))
            ) count ++;
            
        }
		
		System.out.println(count);
    }
}

