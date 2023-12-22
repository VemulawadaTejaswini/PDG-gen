import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
 for(;;){
	 int w =sc.nextInt();
	 if(w==-1)System.exit(0);
	 int value=1150;
	for(int i=11; i<=w; i++){
		if(i<=20) value +=125;
		else if(i>30) value +=160;
		else value += 140;
	}
 System.out.println(4280-value);
 }
}
 }