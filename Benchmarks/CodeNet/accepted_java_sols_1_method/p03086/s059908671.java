import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = {"A","C","G","T"};
        int count = 0;
        int max = 0;
        for(int i=0; i<a.length(); i++) {
            for(int j=0; j<4; j++) {
                if(a.substring(i, i+1).equals(b[j])) {
                    count++;
                    break;
                }
                if(j==3) {
                    count = 0;
                }
            }
            if(max < count) {
                max = count;
            }
        }
        System.out.println(max);
    }
}