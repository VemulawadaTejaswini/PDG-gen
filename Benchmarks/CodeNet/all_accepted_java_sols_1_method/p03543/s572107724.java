import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int mae = n/10;
	int ato = n%1000;

	int flag = -1;
	for(int i = 0; i <= 9; i++){
	    if(mae == 111*i || ato == 111*i){
		flag = 1;
	    }
	}
	if(flag == 1){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
	
    }
}
