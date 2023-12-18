import java.util.Scanner;
class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int count = 0;
	int i=sc.nextInt();
	while(i!=0){
	    count++;
	    System.out.println("Case "+count+": "+i);
	    i=sc.nextInt();
	}
    }
}