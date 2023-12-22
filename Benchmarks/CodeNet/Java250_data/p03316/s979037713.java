import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int s = scan.nextInt();

	int tmp = s;
	int sn = 0;
	while(tmp != 0){
	    sn += tmp % 10;
	    tmp /= 10;
	}

	if(s % sn == 0){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}

	    
	
