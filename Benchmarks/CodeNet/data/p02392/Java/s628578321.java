import java.util.Scanner;

class Main{
    static boolean hikaku(int a,int b){
	if(a < b)
	    return (true);
	else
	    return(false);
    }

    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int x = stdIn.nextInt();
	int y = stdIn.nextInt();
	int z = stdIn.nextInt();
	if(hikaku(x,y) && hikaku(y,z))
	    System.out.println("Yes");
	else
	    System.out.println("No");
    }
}