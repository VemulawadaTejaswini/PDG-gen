import java.util.Scanner;
import java.util.Date;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Sum sum = new Sum();

	sum.set();

	while(sc.hasNext()){
	    int n=sc.nextInt();
	    System.out.println(sum.pop(n));
	}
    }
}

class Sum{
    private int A[]=new int[40];
    
    void set(){
	for(int i=0;i<=9;i++){
	    for(int j=0;j<=9;j++){
		for(int k=0;k<=9;k++){
		    for(int h=0;h<=9;h++)
			{
			    A[i+j+k+h]+=1;
			}
		}
	    }
	}
    }
    
    int pop(int a){
	return A[a];
    }
}