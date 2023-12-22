import java.util.Scanner;
class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	System.out.print(" ");
	for(int i=1;i<=n;i++){
	    int num=i;
	    if(num%3==0) {
		if(count==0) System.out.print(i);
		else System.out.print(" "+i);
		count++;
	    }
	    else {
		while(num!=0){
		    if(num%10==3){
			if(count==0) System.out.print(i);
			else System.out.print(" "+i);
			count++;
			break;
		    }
		    num/=10;
		}

	    }
	  
	}
	System.out.println("");
    }
}