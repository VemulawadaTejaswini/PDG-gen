import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int dig = n%10;
	    if(dig==2||dig==4||dig==5||dig==7||dig==9){
            System.out.println("hon");
        }
	    else if(dig==0||dig==1||dig==6||dig==8){
            System.out.println("pon");
        }
	    else{
            System.out.println("bon");
        }
    }
}
