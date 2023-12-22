import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int[]a=new int[3];
	for(int i=0;i<3;i++)a[i]=sc.nextInt();
	for(int i=0;i<2;i++){
	    int min=i;
	    for(int j=i;j<3;j++){
		if(a[min]>a[j]){
		    int c=a[min];
		    a[min]=a[j];
		    a[j]=c;
		}
	    }
	}
	for(int i=0;i<2;i++)System.out.print(a[i]+" ");
	System.out.println(a[2]);
    }
    public static void main(String[]ag){
	new Main().main();
    }
}