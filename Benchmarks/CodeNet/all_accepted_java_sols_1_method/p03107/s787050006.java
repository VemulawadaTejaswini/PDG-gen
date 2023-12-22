import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String A = s.replaceAll("0", "");
        String B = s.replaceAll("1", "");
        
        System.out.println(Math.min(A.length(), B.length())*2);
    }
}