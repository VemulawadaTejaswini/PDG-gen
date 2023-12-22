import java.util.Scanner;
import java.util.InputMismatchException;
class Main{
public static void main(String args[]){

    Scanner scan = new Scanner(System.in);
    try{
int S = scan.nextInt();
int h=0;
int m=0;
int s=0;



h=S / 3600;
m= (S % 3600) / 60;
s=(S % 3600) % 60;

System.out.println(h +":"+ m +":"+ s);

}catch (InputMismatchException e) {
        	System.out.println("try again!!");
        }





}
}

