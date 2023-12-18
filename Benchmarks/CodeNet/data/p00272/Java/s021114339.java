
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


int k,inatai,atai,maisu;



for(k=0;k<=4;k++){
	atai=sc.nextInt();

	maisu=sc.nextInt();
switch(atai){

case 1:inatai = 6000*maisu;break;
case 2:inatai = 4000*maisu;break;
case 3:inatai = 3000*maisu;break;
case 4:inatai = 2000*maisu;break;


System.out.println(inatai);


}
}
}
}