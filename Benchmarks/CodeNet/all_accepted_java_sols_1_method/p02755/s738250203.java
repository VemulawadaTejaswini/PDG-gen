import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
    	int res = -1;
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        for(int i = 0;i<1010;i++) {
            if((int)(i*0.1) == B && (int)(i*0.08)==A){
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}