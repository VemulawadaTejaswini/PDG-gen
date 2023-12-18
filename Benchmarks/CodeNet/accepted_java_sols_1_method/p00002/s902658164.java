import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	while(sc.hasNextInt()){
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=String.valueOf(a+b).length();
	    System.out.println(c);
	}
    }
}