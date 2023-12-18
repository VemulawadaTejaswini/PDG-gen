
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int k;
int []intake = new int[4];
int inatai;
int atai=sc.nextInt();
int maisu=sc.nextInt();


for(k=0;k<=4;k++){
switch(atai){

case 1:inatai = 6000*maisu;break;
case 2:inatai = 4000*maisu;break;
case 3:inatai = 3000*maisu;break;
case 4:inatai = 2000*maisu;break;


System.out.println(atai); 	
System.out.println(maisu);
System.out.println(inatai);
}	
}
}
}