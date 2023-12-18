import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			String[] linearr = line.split(" ");
			int a = Integer.parseInt(linearr[0]);
			int b = Integer.parseInt(linearr[1]);
			int c = Integer.parseInt(linearr[2]);
			if(a < b){
				if(b < c){//a < b < c
					System.out.println(a+" "+b+" "+c);
				}else{//a<b, b>=c
					if(a < c){
						System.out.println(a+" "+c+" "+b);
					}else{
						System.out.println(c+" "+a+" "+b);
					}
				}
			}else{//b<=a
				if(a < c){
					System.out.println(b+" "+a+" "+c);
				}else{//b<=a, c<=a
					if(b < c){
						System.out.println(b+" "+c+" "+a);
					}else{
						System.out.println(c+" "+b+" "+a);
					}
				}
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}