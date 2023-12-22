import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {		
		InputStreamReader reader = new InputStreamReader(System.in);
		
		int key,i,a[];
		a=new int[100];
		key='.';
	key=reader.read();
	
		while(true){
			i=0;
			a[i]=0;
			
			if(key=='.')
				break;
			while(true){
				if(key=='['||key=='('){
					i++;
					a[i]=key;
				}
				else if(key==']'){
					if(a[i]!='['){
						while(key!='.'){
							key=reader.read();
						
						}
						System.out.println("no");
						break;
					}
					i--;
				}
				else if(key==')'){
					if(a[i]!='('){
						while(key!='.'){
							key=reader.read();
					
						}
						System.out.println("no");
						break;
					}
					i--;
				}
				key=reader.read();
		
				if(key=='.'){
					if(i==0){
						System.out.println("yes");
						break;
					}
					else{
						System.out.println("no");
						break;
					}
				}
			}
			while(key!='\n'){
			key=reader.read();
		
			}
		key=reader.read();
		
		} 
	} 
}