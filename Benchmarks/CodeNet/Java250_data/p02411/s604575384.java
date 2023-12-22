import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    while(sc.hasNext()){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d = a+b;

	        if((a==-1)&&(b==-1)&&(c==-1))
	            break;
            else{
                if(d>=80)
                    System.out.print("A\n");
                else if(d>=65&&d<80)
                    System.out.print("B\n");
                else if((d>=50&&d<65)||c>=50)
                    System.out.print("C\n");
                else if((d<30)||((a==-1||b==-1)))
                    System.out.print("F\n");
                else if((d>=30)&&(d<50))
                    System.out.print("D\n");

            }
        }
    }
}

