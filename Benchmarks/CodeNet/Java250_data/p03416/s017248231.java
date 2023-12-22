
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int result=0;
        for(int i=A;i<=B;i++){
            if(isKaibun(i)) result++;
        }
        System.out.println(result);
    }
    public static boolean isKaibun(int x){
        int a=x/10000;
        int b=(x-a*10000)/1000;
        int c=(x-a*10000-b*1000)/100;
        int d=(x-a*10000-b*1000-c*100)/10;
        int e=(x-a*10000-b*1000-c*100-d*10);
        return a==e&&b==d;
    }
}
