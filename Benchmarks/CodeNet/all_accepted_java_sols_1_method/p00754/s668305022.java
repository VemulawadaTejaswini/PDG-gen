import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String sent;
		while((sent=scan.nextLine()).length()!=1){
			ArrayList<Integer> bracket = new ArrayList<Integer>();
			boolean endFlag=false;
			int level=-1;
			for(int i=0;i<sent.length();i++){
				switch(sent.charAt(i)){
					case '[':
						bracket.add(1);
						level+=1;
						break;
					case ']':
						if(level>-1 && bracket.get(level)==1){
							bracket.remove(level);
							level-=1;
						}
						else endFlag=true;
						break;
					case '(':
						bracket.add(2);
						level+=1;
						break;
					case ')':
						if(level>-1 && bracket.get(level)==2){
							bracket.remove(level);
							level-=1;
						}else endFlag=true;
						break;
				}
				if(endFlag)break;
			}
			if(endFlag || level!=-1)System.out.println("no");
			else                   System.out.println("yes");
		}
	}
}