import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String[] s = new String[n];
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for(int i = 0; i<n; i++) {
            s[i] = sc.next();
            switch (s[i]){
                case "AC":
                    c0++;
                    break;
                case "WA":
                    c1++;
                    break;
                case "TLE":
                    c2++;
                    break;
                case "RE":
                    c3++;
                    break;
            }
        }

        System.out.println("AC × " + c0);
        System.out.println("WA × " + c1);
        System.out.println("TLE × " + c2);
        System.out.println("RE × " + c3);
	}
}