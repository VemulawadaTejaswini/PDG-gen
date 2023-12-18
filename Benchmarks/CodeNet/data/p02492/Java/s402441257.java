import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int[] n=new int[3];
		while((s=r.readLine())!=null){
			t=s.split(" ");
			if(t[1].equals("?")){
				System.exit(0);
			}
			n[0]=Integer.parseInt(t[0]);
			n[2]=Integer.parseInt(t[2]);
			if((t[1]).equals("+")){
					System.out.println(n[0]+n[2]);
			}else if((t[1]).equals("-")){
					System.out.println(n[0]-n[2]);
			}else if((t[1]).equals("*")){
					System.out.println(n[0]*n[2]);
			}else{
					System.out.println(n[0]/n[2]);
			}
		}
	}
}