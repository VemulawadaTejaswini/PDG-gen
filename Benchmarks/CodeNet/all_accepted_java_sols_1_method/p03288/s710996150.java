import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int R = sc.nextInt();
		
		if(R < 1200){
	   		System.out.println("ABC");
		}else if(R < 2800){
	   		System.out.println("ARC");
		}else{
	   		System.out.println("AGC");
		}

		
   		sc.close();
        return ;

    }
    
}

