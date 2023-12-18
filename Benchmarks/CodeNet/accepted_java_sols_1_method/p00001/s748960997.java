import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int[] hills = new int[10];
	for(int i=0; i<10; i++){
	    hills[i] = sc.nextInt();
	}

	int max = 0;
	int maxi = 0;;
	for(int j=0; j<3; j++){
	    max = 0;
	    for(int i=0; i<10; i++){
		if(hills[i]>max){max = hills[i]; maxi = i;}
	    }
	    System.out.println(max);
	    hills[maxi] = 0;
	}
    }
}