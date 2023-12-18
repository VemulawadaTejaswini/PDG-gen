import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int[] a = new int[n];
	for(int i = 0; i < n; i++){
	    a[i] = scan.nextInt()-1;
	}

	int i = 0;
	int count = 1;
	while(true){
	    if(a[i] == 1){
		break;
	    }else if(a[i] == -1){
		break;
	    }else{
		int tmp = i;
		i = a[i];
		a[tmp] = -1;
		count++;
	    }
	}

	if(a[i] == -1){
	    System.out.println(-1);
	}else{
	    System.out.println(count);
	}
    }
}
