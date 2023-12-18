import java.util.Scanner;
public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);

	int n = in.nextInt();

	System.out.print(" ");
	for(int i=1; i<=n; i++){
	    if(times3(i)){
		System.out.print(i);
		if(i!=n)System.out.print(" ");
	    }
	    else if(include3(i)){
		System.out.print(i);
		if(i!=n)System.out.print(" ");
	    }
	}
	System.out.println();
    }
    public static boolean times3(int num){
	if(num%3==0)return true;
	else return false;
    }

    public static boolean include3(int num){
	while(num>0){
	    if(num%10==3)return true;
	    num/=10;
	}
	return false;
    }

}

