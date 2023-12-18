import java.io.*;
import java.util.*;
class Main{
	public static void print(Object o){
		System.out.println(o);
	}
	public static void main(String[] args){
					int i01 = 0;
			int i02 = 0;
			int i03 = 0;
			int tmp0;
			try{
				i01 = System.in.read();
				tmp0 = System.in.read();
				i02 = System.in.read();
				tmp0 = System.in.read();
				i03 = System.in.read();
				tmp0 = System.in.read();
				tmp0 = System.in.read();
			}
			catch(Exception e){
				
			}
						char i04 =(char)i02;
			int i05 =(char)i01 - '0';
			int i06 =(char)i03 - '0';
			
			switch (i04){
				case '+':
					print(i05+i06);
				break;
				case '-':
					print(i05-i06);
				break;
				case '*':
					print(i05*i06);
				break;
				case '/':
					print(i05/i06);
				break;
				case '?':
				break ;
			}

		outside:while(true){
			if(i04 == '?'){
				break;
			}
			int i1 = 0;
			int i2 = 0;
			int i3 = 0;
			int tmp;
			try{
				i1 = System.in.read();
				tmp = System.in.read();
				i2 = System.in.read();
				tmp = System.in.read();
				i3 = System.in.read();
				tmp = System.in.read();
				tmp = System.in.read();
			}
			catch(Exception e){
				
			}
			char i4 =(char)i2;
			int i5 =(char)i1 - '0';
			int i6 =(char)i3 - '0';
			

			switch (i4){
				case '+':
					print(i5+i6);
				break;
				case '-':
					print(i5-i6);
				break;
				case '*':
					print(i5*i6);
				break;
				case '/':
					print(i5/i6);
				break;
				case '?':
				break outside;
			}
		}
	}
}