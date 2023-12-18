import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()) {
			String a =sc.nextLine();
			char[] o=a.toCharArray();
			for(int i=0;i<26;i++){
				//System.out.println();
				for(int j =0;j<o.length;j++){
					if(o[j]>='a'&&o[j]<='z'){
						if(o[j]=='z'){
							o[j]='a';
						}else{
							o[j]++;
						}	
					}
				}
				String ans=String.valueOf(o);
				// System.out.println(ans);
				if(ans.contains("this")||ans.contains("that")||ans.contains("the")){
					System.out.println(ans);
					break;
				}


			}
		}
	}
}