import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m;
        int f;
        int r;

        while(true){

        	m = scan.nextInt();
        	f = scan.nextInt();
        	r = scan.nextInt();
        	int sum = m+f;

        	if( m == -1 && f == -1 && r == -1){
        		break;
        	}
        	else if(m == -1 || f == -1){
        		System.out.println("F");
        	}else if(sum < 30 ){
        		System.out.println("F");
        	}
        	else if(sum >= 80){
        		System.out.println("A");
        	}
        	else if(sum >= 65 && sum < 80 ){
        		System.out.println("B");
        	}
        	else if(sum >= 50 && sum < 65 && r == -1){
        		System.out.println("C");
        	}
        	else if(sum >= 50 && sum < 65 && r >= 50){
        		System.out.println("C");
        	}
        	else if(sum >= 30 && sum < 50 && r >= 50){
        		System.out.println("C");
        	}
        	else if(sum >= 30 && sum < 50 && r < 50){
        		System.out.println("D");
        	}
        	else if(sum >= 30 && sum < 50 && m == 0 && r < 50){
        		System.out.println("D");
        	}
        	else if(sum >= 30 && sum < 50 && f == 0 && r < 50){
        		System.out.println("D");
        	}
        }

     }
}