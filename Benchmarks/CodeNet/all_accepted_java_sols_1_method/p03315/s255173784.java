import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        String s = sc.nextLine();

        for(int i=0; i<4; i++) {
            char c = s.charAt(i);
            if(c=='+') res++;
            else if(c=='-') res--;
        }
        System.out.println(res);
    }
}