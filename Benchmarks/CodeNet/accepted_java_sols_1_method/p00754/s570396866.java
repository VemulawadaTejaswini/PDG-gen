import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.File;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader reader = new InputStreamReader(System.in);
		int key,i,a[],flag;
		a=new int[100];
		key='.';
		key=reader.read();
		while(true){  //while outside
			//System.out.print((char)key+"-");
			//System.out.print("***");
			i=0;
			a[i]=0;
			
			if(key=='.')
				break;
			while(true){	//while inside
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
			} //while(true) inside
			
			while(key!='\n'){
				key=reader.read();
			}
			//System.out.print((char)key);
			//if(key=='\n'){
			key=reader.read();
			//}
			//key=reader.read();
			
		} //while outside
	} //main
} //class