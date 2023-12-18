import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String base26 = Long.toString(n,26);
		String ans = "";
		for(int i = 0; i < base26.length(); i++) {
			if(base26.charAt(i)=='1') {
				if(i+1<base26.length()&&base26.charAt(i+1)=='0')ans+='z';
				else ans+='a';
			}
			else if(base26.charAt(i)=='2')ans+='b';
			else if(base26.charAt(i)=='3')ans+='c';
			else if(base26.charAt(i)=='4')ans+='d';
			else if(base26.charAt(i)=='5')ans+='e';
			else if(base26.charAt(i)=='6')ans+='f';
			else if(base26.charAt(i)=='7')ans+='g';
			else if(base26.charAt(i)=='8')ans+='h';
			else if(base26.charAt(i)=='9')ans+='i';
			else if(base26.charAt(i)=='a')ans+='j';
			else if(base26.charAt(i)=='b')ans+='k';
			else if(base26.charAt(i)=='c')ans+='l';
			else if(base26.charAt(i)=='d')ans+='m';
			else if(base26.charAt(i)=='e')ans+='n';
			else if(base26.charAt(i)=='f')ans+='o';
			else if(base26.charAt(i)=='g')ans+='p';
			else if(base26.charAt(i)=='h')ans+='q';
			else if(base26.charAt(i)=='i')ans+='r';
			else if(base26.charAt(i)=='j')ans+='s';
			else if(base26.charAt(i)=='k')ans+='t';
			else if(base26.charAt(i)=='l')ans+='u';
			else if(base26.charAt(i)=='m')ans+='v';
			else if(base26.charAt(i)=='n')ans+='w';
			else if(base26.charAt(i)=='o')ans+='x';
			else if(base26.charAt(i)=='p')ans+='y';
		}
		System.out.println(ans);
	 }
}