import java.util.Scanner;
class Main{
    public static void main(String[] args){
	int count=0,i,j,yaku=0;
	int array[] = new int[10001];
	
	Scanner scan = new Scanner(System.in);
	array[0] = scan.nextInt();
	if(1>array[0] || array[0]>10000){System.exit(0);}
	 
	for(i=1;i<=array[0];i++){  
	    array[i] = scan.nextInt();
	    for(j=2;j<array[i];j++){
		if(array[i]%j==0){
		    yaku++;
		}
	    }
	    if(yaku==0){count++;}
	    yaku=0;
	}
	System.out.println(count);
    }
}

