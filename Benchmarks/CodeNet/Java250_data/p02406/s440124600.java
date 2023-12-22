import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			int numN = scanner.nextInt();
			int numn;
			
            for(numn = 3; numn <= numN; numn++){

            	if (numn % 3 == 0){
            		System.out.print(" "+numn);
            	}
            	else if(numn % 10 == 3){
            		System.out.print(" "+numn);
            	}
            	else if(numn % 100 / 10 == 3){
            		System.out.print(" "+numn);
            	}
            	else if(numn % 1000 / 100 == 3){
            		System.out.print(" "+numn);
            	}
            	else if(numn % 10000 / 1000 == 3){
            		System.out.print(" "+numn);
            	}
            	else if(numn / 10000 == 3){
            		System.out.print(" "+numn);
            	}
            	else{
            	}
            }
            System.out.println();
	}
}