import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int max,i,j,h;
	int a[]= new int [10];

	for(i=0;i<10;i++)a[i] = sc.nextInt();

	for(i=0;i<10;i++){
	    max=i;
	    for(j=i;j<10;j++){
		if(a[max]<a[j])max=j;
	    }
	    h=a[max];
	    a[max]=a[i];
	    a[i]=h;
	}

	for(i=0;i<3;i++)System.out.println(a[i]);


    }

}