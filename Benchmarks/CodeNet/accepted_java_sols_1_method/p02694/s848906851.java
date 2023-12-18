import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
	int countYear = 0;
	long nowmoney = 100;
	while(nowmoney < x){
	    nowmoney *= 1.01;
	    countYear++;
	}
	System.out.print(countYear);
    }
}
