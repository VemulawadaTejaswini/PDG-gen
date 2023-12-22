import java.util.Scanner;
class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int count = 0;
	while(true){
	    count=0;
	    int n=sc.nextInt();
	    int x=sc.nextInt();
	    if(n==0 && x==0) break;
	    for(int i=1;i<=n;i++){
		for(int j=i+1;j<=n;j++){
		    for(int k=j+1;k<=n;k++){
			if(i+j+k==x) count++;
		    }
		}
	    }
	    System.out.println(count);
	}
    }
}