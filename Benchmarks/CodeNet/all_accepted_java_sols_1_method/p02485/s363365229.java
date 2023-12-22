import java.util.Scanner;
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String str =sc.next();
			int a=0;
			if(str.equals("0")){
				break;
			}
			for(int i=0;i<str.length();i++){
				switch(str.charAt(i)){
					case '0':
						break;
					case '1':
						a=a+1;
						break;
					case '2':
						a=a+2;
						break;
					case '3':
					 	a=a+3;
					 	break;
					 case '4':
					 	a=a+4;
					 	break;
					 case '5':
					 	a=a+5;
						break;
					case '6':
						a=a+6;
						break;
					case '7':
						a=a+7;
						break;
					case '8':
					 	a=a+8;
					 	break;
					 default:
					 	a=a+9;
					 	break;
					 }


				}
				System.out.println(a);
			}
		}
		}