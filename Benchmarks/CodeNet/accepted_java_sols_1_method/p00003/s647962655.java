import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for(int i=0; i<count; i++){
        	int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            a*=a;
            b*=b;
            c*=c;

            if(a+b==c || b+c==a || c+a==b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}