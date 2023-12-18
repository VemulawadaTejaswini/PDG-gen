import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++){
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int sum=a+b;
	    int count=0;
	    while(true){
		count++;
		sum/=10;
		if(sum==0) break;
	    }
	    System.out.println(count);
	}
    }
}