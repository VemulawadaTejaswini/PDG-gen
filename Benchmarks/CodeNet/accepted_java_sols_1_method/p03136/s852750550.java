import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();

	int[] l = new int[n];
	int max = 0;
	int sum = 0;
	for(int i = 0; i < n; i++){
	    l[i] = scan.nextInt();
	    if(max < l[i]){
		max = l[i];
	    }
	    sum += l[i];
	}

	if(sum - max > max){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
	
