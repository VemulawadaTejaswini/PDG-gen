import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] n = sc.next().toCharArray();
            for(int i=0;i<10;i++) {
                n[i]-='0';
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 9 - i; j++) {
                    n[j]=(char) ((n[j]+n[j+1])%10);
                }
            }
            System.out.println((char)(n[0]+'0'));
        }
    }
}
