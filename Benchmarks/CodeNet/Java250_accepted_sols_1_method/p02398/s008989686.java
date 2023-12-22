import java.util.Scanner;

public class Main {
	public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                int iNumA = scan.nextInt();
                int iNumB = scan.nextInt();
                int iNumC = scan.nextInt();
                int count = 0;
                for(int i=iNumA; i<=iNumB; i++){
                	if(iNumC%i == 0)
                		count++;
                }
                System.out.println(count);
	}
}