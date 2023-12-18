import java.util.Scanner;
class Main{
    public static void main(String[] args){
	int key,i,j,k;
	int array[] = new int[100];

	Scanner scan = new Scanner(System.in);
	array[0] = scan.nextInt();
	for(i=1;i<=array[0];i++){
	array[i] = scan.nextInt();
	}

	System.out.println("");
	
	for(j=1;j<=array[0];j++){
	    key = array[j];
	    i = j-1;
	    while(i>0 && array[i]>key){
		array[i+1] = array[i];
		i--;
		array[i+1] = key;
	    }
	    for(k=1;k<=array[0];k++){
		System.out.print(array[k]+" ");
	    }
	    System.out.println("");
	}
    }
}

