import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str=new StringBuilder(br.readLine());
        int l=Integer.parseInt(br.readLine());
		for(int i=0;i<l;i++){
	        String[] op=br.readLine().split(" ");
			int op1=Integer.parseInt(op[1]);
			int op2=Integer.parseInt(op[2]);
			if(op[0].equals("print")){
				System.out.println(str.substring(op1,op2+1));
			}else if(op[0].equals("reverse")){
				str=str.replace(op1,op2+1,new StringBuilder(str.substring(op1,op2+1)).reverse().toString());
			}else if(op[0].equals("replace")){
				str=str.replace(op1,op2+1,op[3]);
			}
		}
	}
}