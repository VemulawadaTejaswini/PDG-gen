import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int syakkin=100000;
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
	    syakkin*=1.05;
	    if(syakkin%1000!=0){
		syakkin=((syakkin/1000)+1)*1000;
	    }
	}
	System.out.println(syakkin);
    }
}