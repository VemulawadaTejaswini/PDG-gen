import java.util.Scanner;
class Main{
	public static void main(String[] args){
	Scanner inp=new Scanner(System.in);
	String a=inp.next();
	
	for(int i=0;i<a.length();i++){
		if(a.charAt(i)=='C'){
			while(i<a.length()){
				if(a.charAt(i)=='F'){
					a="Yes";
					i=a.length();
				}
				i++;
			}
		}
	}
	if(a!="Yes")a="No";
	System.out.println(a);
	}
}