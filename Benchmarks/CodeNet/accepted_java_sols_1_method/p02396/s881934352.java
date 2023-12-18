import java.util.Scanner;
class Main{
    public static void main(String[] av){
	Scanner sc=new Scanner(System.in);
	int x;
	int i=1;
	while(true){
	    x=sc.nextInt();
	    if(x==0) break;
	    else{
	    System.out.println("Case "+i+": "+x);
	    i++;
	    }
	}

    
    
    }
}
