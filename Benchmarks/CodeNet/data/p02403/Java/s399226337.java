package practice;
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int W,H;
for(;;){
H =sc.nextInt();
W =sc.nextInt();
if(W == 0 && H==0) break;
for(int i=H;i>0;i--){
for(int n=W;n>0;n--){	
System.out.print("#");
}
System.out.println();
}
}
}
	}