import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
	try{
	  File inputFile = new File("data.txt");
	  Scanner scan = new Scanner(inputFile);
	  String caseStr = "Case";
	  String colonStr = ":";
	  
          int line = 1;
 	  while(scan.hasNext()){
	  	int inputNum = scan.nextInt();
		if(inputNum == 0){
			break;
		}
	  System.out.println(caseStr + line + colonStr + inputNum);
	  line ++;
	}
}catch(FileNotFoundException e){
	e.printStackTrace();
}
}
}