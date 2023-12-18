import java.util.Scanner;
class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.print(" ");
	for(int i=1;i<=n;i++){
	    if(i%3==0) {
		if(i==0) System.out.print(i);
		else System.out.print(" "+i);
	    }
	    else if((i%10)==3){
		if(i==0) System.out.print(i);
		else System.out.print(" "+i);
	    }
	    else if(i/10==3){
		if(i==0) System.out.print(i);
		else System.out.print(" "+i);
	    }
	}
	System.out.println("");
    }
}