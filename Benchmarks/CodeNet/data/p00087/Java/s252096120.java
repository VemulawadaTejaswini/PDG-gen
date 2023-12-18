import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			double[] stack=new double[80];
			int ptr=0;
			String[] str=sc.nextLine().split(" ");
			for(int i=0;i<str.length;i++){
				try{
					stack[ptr]=Double.parseDouble(str[i]);
					ptr++;
				}catch(NumberFormatException e){
					if(str[i].equals("+")){
						stack[ptr-2]+=stack[ptr-1];
						ptr--;
					}
					if(str[i].equals("-")){
						stack[ptr-2]-=stack[ptr-1];
						ptr--;
					}
					if(str[i].equals("*")){
						stack[ptr-2]*=stack[ptr-1];
						ptr--;
					}
					if(str[i].equals("/")){
						stack[ptr-2]/=stack[ptr-1];
						ptr--;
					}
				}
			}
			System.out.println(stack[0]);
		}
	}
}