
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int x=scanner.nextInt();
        int y=x/50;
        int result=0;
        for(int i=0;i<=y/10;i++){
            if(i>a){
                break;
            }
            int a1=i;
            int y1=y-a1*10;
            int b1=y1/2;
            for(int j=b1;j>=0;j--){
                int b2=j;
                int c2=y1-2*b2;
                if(b2<=b&&c2<=c){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
