
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int []t = new int[3];
for(;;){
	String rank ="A";
	for(int i=0; i<3; i++) t[i] =sc.nextInt();
	if(t[0]==-1 && t[1]==-1 && t[2]==-1) break;

	if((t[0]+t[1])>=65 && (t[0]+t[1])<80) rank ="B";
	if((t[0]+t[1])>=50 && (t[0]+t[1])<65) rank ="C";
	if((t[0]+t[1])>=30 && (t[0]+t[1])<50){
		if(t[2]<50) rank ="D";
		if(t[2]>=50)rank ="C";
	}
	if(t[0]== -1 || t[1]== -1 ) rank ="F";
	if(t[0]+t[1]<30) rank ="F";
	System.out.println(rank);
}
}
}