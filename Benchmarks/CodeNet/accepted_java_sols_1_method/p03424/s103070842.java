import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    char a[]=new char[n];
	    for(int i=0;i<n;i++) {
	    	a[i]=scan.next().charAt(0);
	    }
	    scan.close();
	    int check=0;
	    for(int i=0;i<n;i++) {
	    	if(a[i]=='Y') {
	    		check=1;
	    		break;
	    	}
	    }
	    System.out.println((check==1)? "Four":"Three");
	}

}