import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	int i=1,j=0;
	Scanner sc =new Scanner(System.in);    
	while(true){
	
	int H=sc.nextInt();
	int W=sc.nextInt();
	if(H==0 && W==0){break;}
	while(i<=H){
	    if(i%2==0){
		for(j=1;j<=W;j++){
		    if(j%2==0){System.out.printf("#");}
		    else{System.out.printf(".");}}}
		if (i%2!=0) {
		    for(j=1;j<=W;j++){
			if(j%2==0){System.out.printf(".");}
			else{System.out.printf("#");}
		    }
		}
		System.out.printf("\n");
		i++;
	}
	i=1;
	j=0;
	System.out.printf("\n");}
    }
}