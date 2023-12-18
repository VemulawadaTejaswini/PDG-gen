import java.io.*;
public class Main{
	public static boolean search(String str,String key){
		int cursol = 0;
		int flag=0;
		for(int i = 0 ;; i ++){
			if(cursol!=0 && str.charAt(i)!=key.charAt(cursol))
				cursol=0;
			if(str.charAt(i)==key.charAt(cursol)){
				cursol++;
			}
			if(cursol==key.length()){
				return true;
			}
			if(i==str.length()-1){
				if(flag==0){
					i=-1;
				flag++;
				}
			}	
			if(flag==2){
				return false;
			}
		}
			
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String key = br.readLine();
		if(str.indexOf(key)!=-1)
			System.out.println("Yes");
		else{
			if(search(str,key))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}