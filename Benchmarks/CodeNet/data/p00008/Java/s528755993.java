import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){

	    int n = sc.nextInt();

	    int count = 0;
	    int sum = 0;
	    for(int i=0; i<=9; i++){
		for(int j=0; j<=9; j++){
		    for(int k=0; k<=9; k++){
			for(int l=0; l<=9; l++){
			    sum = i+j+k+l;
			    if(sum==n){count++; l = 9;}
			}
		    }
		}
	    }

	    System.out.println(count);
	}
    }
}