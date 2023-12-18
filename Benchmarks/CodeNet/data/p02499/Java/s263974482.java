import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String sent;
		int[] alphaNum = new int[26];
		
		while(true){
			sent=scan.nextLine();
			if(sent.length()==0){
				break;
			}
			for(int i=0;i<sent.length();i++){
				char temp=sent.charAt(i);
				if(temp<97){
					temp+=32;
				}
				if(96<temp && temp<98+26){
					alphaNum[temp-97]+=1;
				}
			}
		}
		for(int i=0;i<26;i++){
			char b=(char)(i+97);
			System.out.println(b+" : "+alphaNum[i]);
		}
	}
}