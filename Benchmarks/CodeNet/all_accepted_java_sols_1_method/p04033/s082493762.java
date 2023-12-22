
import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

long a=s.nextLong();long b=s.nextLong();
if(a<0&&b<0) {
	long xx=Math.max(a,b)-Math.min(b, a);
	if(xx%2!=0)
	System.out.println("Positive");
	else
		System.out.println("Negative");
	return;
}
else if(a>0&&b>0) {
	System.out.println("Positive");
}else {
	System.out.println("Zero");
}
	}

}
