import java.util.Scanner;
class Main{
    public static void main(String[] args){
	int array[] = new int[101];
	int i,j,count=0,flag=1,temp;

	Scanner scan = new Scanner(System.in);
	array[0] = scan.nextInt();

	for(i=1;i<=array[0];i++){
	    array[i] = scan.nextInt();
	}
	
	while(flag!=0){
	    flag=0;
	    for(j=array[0];j>1;j--){
		if(array[j] < array[j-1]){
		    temp = array[j];
		    array[j] = array[j-1];
		    array[j-1] = temp;
		    flag = 1;
		    count++;
		}
	    }
	}
	for(i=1;i<=array[0];i++){
	    if(i==array[0]){System.out.println(array[i]+"\n"+count);}
	    else System.out.print(array[i]+" ");
	}
    }
}

