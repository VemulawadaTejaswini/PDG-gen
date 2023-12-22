import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n = -1;
		int i = 1;
		int x;
		try{
			line = reader.readLine();
			n = Integer.parseInt(line);
			while(true){
				x = i;
				if(x % 3 == 0){
					System.out.print(" "+i);
				}else{
					while(true){
						if(x % 10 == 3){
							System.out.print(" "+i);
							break;
						}else{
							x /= 10;
							if(x != 0){
								continue;
							}else{
								break;
							}
						}
					}
				}
				if(++i <= n){
					continue;
				}else{
					break;
				}
			}
			System.out.print("\n");
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}