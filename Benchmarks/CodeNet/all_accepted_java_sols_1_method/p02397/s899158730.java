import java.util.Scanner;

public class Main {
	public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                for(int i=1; i>0; i++){
                        int iNum1 = scan.nextInt();
                        int iNum2 = scan.nextInt();
                        if(iNum1 == 0 && iNum2 == 0)
                                break;
                        if(iNum1 > iNum2){
                        	int temp = iNum1;
                        	iNum1 = iNum2;
                        	iNum2 = temp;
                        }
                        System.out.println(iNum1 + " " + iNum2);
                }
	}
}