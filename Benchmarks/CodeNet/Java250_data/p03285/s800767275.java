import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();

	int four = N/4;
	int seven = N/7;

	int count = 0;
	for(int i = 0; i <= four; i++){
	    for(int j = 0; j <= seven; j++){
		if(N == i*4+j*7)
		    count = 1;
	    }
	}
	if(count == 1)
	    System.out.println("Yes");
	else
	    System.out.println("No");
    }
}
