import java.util.*;
import java.math.*;
 class Main
{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
String st=in.nextLine();
int ans=7;
if(st.compareTo("SAT")==0)
 ans=1;
else if(st.compareTo("FRI")==0)
ans=2;
else if(st.compareTo("THU")==0)
ans=3;
else if(st.compareTo("WED")==0)
ans=4;
else if(st.compareTo("TUE")==0)
ans=5; 
else if(st.compareTo("MON")==0)
ans=6;
	System.out.print(ans);
}
}
