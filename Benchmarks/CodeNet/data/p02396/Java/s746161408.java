import java.util.Scanner;
import java.util.InputMismatchException;
class Main{
public static void main(String args[]){

    Scanner scan = new Scanner(System.in);
    try{
	int x;
	int cnt=1;
while(true){
    x = scan.nextInt();
    if ( x == 0 ) break;

    	System.out.println("Case "+cnt+": "+ x);
        cnt++;


}



}catch (InputMismatchException e) {
        	System.out.println("try again!!");
        }





}
}

