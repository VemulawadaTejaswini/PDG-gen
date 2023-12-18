import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	while(sc.hasNext()){
	    int[] num = new int[5];
	    for(int i=0; i<num.length; i++){
		num[i] = sc.nextInt();
	    }
	    
	    for(int i=0; i<num.length; i++){
		int max = 0;
		int maxI = 0;
		for(int j=i; j<num.length; j++){
		    if(num[j]>max){
			max = num[j];
			maxI = j;
		    }
		}
		int tmp = num[i];
		num[i] = num[maxI];
		num[maxI] = tmp;
	    }
	    
	    for(int i=0; i<num.length-1; i++){
		System.out.print(num[i]+" ");
	    }
	    System.out.println(num[num.length-1]);
	}
    }
}