import java.util.Scanner;
public class Main{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int[] i=new int[3];
	for(int a=0;a<i.length;a++){
	i[a]=sc.nextInt();
	}
	int size=i.length;
	for(int b=1;b<size;b++){
	    for(int c=0;c<size-b;c++){
		if(i[c]>i[c+1]){
		    int temp=i[c];
		    i[c]=i[c+1];
		    i[c+1]=temp;
		}
	    }
	}
	int x=i[2];
	int y=i[1];
	int z=i[0];
	System.out.printf("%d %d %d\n",z,y,x);
    }
}