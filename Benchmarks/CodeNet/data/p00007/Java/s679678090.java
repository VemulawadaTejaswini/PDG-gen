import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int syakkin=100000;
	int n=sc.nextInt();
	for(int i=0;i<=n;i++){
	    syakkin=syakkin*105/100;
	    syakkin/=1000+1;
	    syakkin*=1000;
	}
	System.out.println(syakkin);
    }
}