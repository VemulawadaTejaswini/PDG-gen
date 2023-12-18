import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner read = new Scanner(System.in);
	int[] fibo = new int[50];
	//make fibo
	fibo[0]=1;
	fibo[1]=1;
	for(int i=2; i<50; i++)fibo[i]=fibo[i-1]+fibo[i-2];

	while(read.hasNext()){
	    System.out.println(fibo[read.nextInt()]);
	}

    }
}