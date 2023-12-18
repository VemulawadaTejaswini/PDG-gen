import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	int H=sc.nextInt();
	int W=sc.nextInt();
	int i=1,j=0;
	while(H!=0 ||W!=0){
	while(i<=H){
	    if(i%2==0){
		for(j=1;j<=W;j++){
		    if(j%2==0){System.out.printf("#");}
		    else{System.out.printf(".");}
		}}
	       

		if (i%2!=0) {
		for(j=1;j<=W;j++){
		    if(j%2==0){System.out.printf(".");}
		    else{System.out.printf("#");}
		}}
		System.out.printf("\n");
		i++;

	}}


	}}