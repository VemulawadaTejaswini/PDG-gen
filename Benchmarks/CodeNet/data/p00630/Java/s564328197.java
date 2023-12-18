import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str,type;
		while(true){
			str=s.next();
			type=s.next();
			if(type.charAt(0)=='X')break;
			String ret="";
			String[]table=str.split("_");
			switch(type.charAt(0)){
				case 'U':
					if(table.length==1){
						ret=(char)(str.charAt(0)&(~32))+str.substring(1);
					}else{
						for(int i=0;i<table.length;i++){
							ret+=(char)(table[i].charAt(0)&(~32))+table[i].substring(1);
						}
					}
					break;
				case 'L':
					if(table.length==1){
						ret=(char)(str.charAt(0)|(32))+str.substring(1);
					}else{
						ret+=table[0];
						for(int i=1;i<table.length;i++){
							ret+=(char)(table[i].charAt(0)&(~32))+table[i].substring(1);
						}
					}
					break;
				case 'D':
					if(table.length!=1)ret=str;
					else for(int i=0;i<str.length();i++){
						if(i>0&&str.charAt(i)>='A'&&str.charAt(i)<='Z')ret+="_"+(char)(str.charAt(i)|32);
						else ret+=(char)(str.charAt(i)|32);
					}
					break;
			}
			System.out.println(ret);
		}
	}
}