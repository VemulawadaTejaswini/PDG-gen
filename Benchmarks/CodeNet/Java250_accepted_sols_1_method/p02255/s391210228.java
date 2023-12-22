import java.util.Scanner;
class Main{
    public static void main(String[] args){
	int key,i,j,k,l;
	int array[] = new int[101];

	Scanner scan = new Scanner(System.in);
	array[0] = scan.nextInt();
	for(l=1;l<=array[0];l++){
	    array[l] = scan.nextInt();
	}
	
	
	for(i=1;i<=array[0];i++){
	    key = array[i];
	    j = i-1;
	    while(j>0 && array[j]>key){
		array[j+1] = array[j];
		j--;
		array[j+1] = key;
	    }
	    for(k=1;k<=array[0];k++){
		if(k==array[0]){System.out.print(array[k]+"\n");
		    break;
		}
		System.out.print(array[k]+" ");
	    }
	}
    }
}

