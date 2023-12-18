import java.util.Scanner;
public class Sorting{

    public static void main (String[] args){

	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a<b){
 if(a>c){System.out.printf("%d %d %d\n",c,a,b);}
if(c<b && a<c){System.out.printf("%d %d %d\n",a,c,b);}
if(b<c){System.out.printf("%d %d %d\n",a,b,c);}
}
	if(a>b){
	    if(a<c){System.out.printf("%d %d %d\n",b,a,c);}
if(c>b && a>c){System.out.printf("%d %d %d\n",b,c,a);}
if(b>c){System.out.printf("%d %d %d\n",c,b,a);}
}



}



}