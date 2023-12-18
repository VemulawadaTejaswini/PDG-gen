import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

int i,j;

int h = sc.nextInt();
int w = sc.nextint();

for(i=1;i<=h;i++){
if(i%2==1){
	for(j=1;j<=w;j++){
		if(j%2==1){System.out.print("#");}
		if(j%2==0){System.out.print(".");}
		System.out.printf("\n");
	}
}
if(i%2==0){	
	for(j=1;j<=w;j++){
		if(j%2==1){System.out.print(".");}
		if(j%2==0){System.out.print("#");}
		System.out.printf("\n");
	}
}

}
}