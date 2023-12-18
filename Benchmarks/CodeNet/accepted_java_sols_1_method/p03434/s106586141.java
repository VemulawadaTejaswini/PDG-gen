import java.util.*;

public class Main{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int temp = 0;
	
	int[] table = new int[n];
	

	for(int i=0;i<n;i++){
	    table[i] = sc.nextInt();
	}
	
	for(int i=0;i<n-1;i++){

	    for(int j=i+1;j<n;j++){
		if(table[i]<table[j]){
		    temp = table[i];
		    table[i] = table[j];
		    table[j] = temp;
		}
	    }
	}

	int a = 0;
	int b = 0;

	for(int i=0;i<n;i++){
	    if(i%2 == 0) a = a + table[i];
	    else b = b + table[i];
	}
	System.out.println(a-b);
    }
}
