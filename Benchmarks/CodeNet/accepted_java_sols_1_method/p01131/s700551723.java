import java.util.*;
class Main{
	static Scanner sc;
	static String instr,outstr,tmpstr;
	static int tim;
	public static void main(String[]args){
		char[][] ch = { {},
									{' ', '.', ',', '!', '?'},
                  {'c', 'a', 'b'},
                  {'f', 'd', 'e'},
                  {'i', 'g', 'h'},
                  {'l', 'j', 'k'},
                  {'o', 'm', 'n'},
                  {'s', 'p', 'q', 'r'},
                  {'v', 't', 'u'},
                  {'z', 'w', 'x', 'y'} };
		sc=new Scanner(System.in);
		tim=sc.nextInt();
		for(int i=0;i<tim;i++){
			outstr="";
			instr=sc.next();
			while(instr.startsWith("0")){
				instr=instr.substring(1,instr.length());
			}
			
			while(instr.indexOf("0")>0){
				tmpstr=instr.substring(0,instr.indexOf("0"));
				instr=instr.substring(instr.indexOf("0")+1,instr.length());
				while(instr.startsWith("0")){
					instr=instr.substring(1,instr.length());
				}
				if(tmpstr.substring(0,1).equals("1")){
					outstr=outstr + ch[1][tmpstr.length()%5];
				}else if(tmpstr.substring(0,1).equals("7") || tmpstr.substring(0,1).equals("9")){
					outstr=outstr + ch[Integer.parseInt(tmpstr.substring(0,1))][tmpstr.length()%4];
				}else{
					outstr=outstr + ch[Integer.parseInt(tmpstr.substring(0,1))][tmpstr.length()%3];
				}
			}
			System.out.println(outstr);
		}
	}
}