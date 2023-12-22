import java.util.Scanner;
import java.util.InputMismatchException;
class Main{
public static void main(String args[]){

    Scanner scan = new Scanner(System.in);
    try{
int W = scan.nextInt();
int H = scan.nextInt();
int x = scan.nextInt();
int y = scan.nextInt();
int r = scan.nextInt();


int temp;


if(0<=x-r && 0<=y-r && x+r <= W && y+r<=H){
	System.out.println("Yes");
}
else 	System.out.println("No");




}catch (InputMismatchException e) {
        	System.out.println("try again!!");
        }





}
}

