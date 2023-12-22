import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	boolean result = false;
	for(int i=0;i<=N/4;i++){
	    if((N-4*i) % 7 == 0){
		result = true;
		break;
	    }
	}
	if(result) System.out.print("Yes");
	else System.out.print("No");
    }
}
