import java.util.Scanner;
class Main{
    public static void main(String[] args){
	int x,y,i,max=0;
	
	Scanner scan = new Scanner(System.in);
	x = scan.nextInt();
	y = scan.nextInt();

	if(1>=x || x>=1000000000){
	    if(1>=y || y>=1000000000){
		System.exit(0);
	    }
	}
	
	if(x>=y){
	    for(i=2;i<=y;i++){
		if((x%i)==0){
		    if((y%i==0)){max=i;}
		}
	    }
	}
	else{
	    for(i=2;i<=x;i++){
		if(y%i==0){
		if(x%i==0){max=i;}
		}
	    }
	}
	System.out.println(max);
    }
}

