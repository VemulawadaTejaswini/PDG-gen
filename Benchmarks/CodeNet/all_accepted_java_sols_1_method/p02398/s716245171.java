import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
        int c = in.nextInt();

	int cnt=0;
	for(int num = a; num<=b; num++){
	    if(c%num==0)cnt++;
	}
	System.out.println(cnt);
    }
}

