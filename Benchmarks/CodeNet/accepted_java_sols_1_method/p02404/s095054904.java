import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Hcount,Wcount;

	    while(true){
	        Hcount = sc.nextInt();
	        Wcount = sc.nextInt();

	        if(Hcount ==0 && Wcount ==0) {
	        	break;
	        }
	        for(int i =0; i<Hcount;i++) {
	        	for(int x =0; x<Wcount;x++) {
		        	if(i==0||i == Hcount-1)
						System.out.print("#");
					else if(x==0||x==Wcount-1)
						System.out.print("#");
					else
						System.out.print(".");
		        }
		        System.out.println();
	        }
	        System.out.println();
	    }
	}
}
