import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	boolean check=true;

	while(sc.hasNext()){
	    
	    char[] charData = sc.nextLine().toCharArray();
	     
	    if(charData[0] == '.') break;

	    Stack<Character> st = new Stack<Character>();
	    
	    /*
	    // ティツ。ツィテァツ、ツコテ」ツ?療」ツ?ヲテ」ツ?ソテ」ツつ?
	    System.out.print("[");
	    for(int i = 0;i<charData.length;i++){
		System.out.print(charData[i] + " ");
	    }
	    System.out.println("]");
	    */
	    
	    for(int i = 0;i<charData.length;i++){
		if(charData[i] == '(') st.push('(');
		if(charData[i] == '[') st.push('[');
		if(!st.empty()){ // テ、ツクツ?・ツ?凝」ツ?ァテ」ツつ?[テ」ツ?古」ツ?づ」ツ?セテ」ツ?」テ」ツ?ヲテ」ツ?淌」ツつ?
		    if(charData[i] == ')' && st.peek().equals('(')){ // テヲツ慊?・ツセツ古」ツ?ォテヲツ崢エテヲツ鳴ーテ」ツ?陛」ツつ古」ツ?淌」ツ?ョテ」ツ??テ」ツ?ァテ」ツ??テ」ツ?古・ツ?・テ・ツ環崚」ツ?陛」ツつ古」ツ?淌」ツ?ィテ」ツ??
			st.pop();
		    }else if(charData[i] == ')') check = false; // )テ」ツ?古」ツ?催」ツ?淌」ツ?妥」ツ?ゥテヲツ慊?・ツセツ古」ツ?ョテヲツ崢エテヲツ鳴ーテ」ツ??テ」ツ?佚」ツつε」ツ?ェテ」ツ?凝」ツ?」テ」ツ?淌」ツ?ィテ」ツ?催」ツ?ッテ」ツ?敕」ツ?ョテヲツ卍づァツつケテ」ツ?ァcheck=falseテ」ツ?ォテ」ツ?療」ツ?ヲテ」ツ?甘」ツ??
		    if(charData[i] == ']' && st.peek().equals('[')){
			st.pop();
		    }else if(charData[i] == ']') check = false;
		}else{ // [(テ」ツ?古」ツ?催」ツ?ヲテ」ツ?ェテ」ツ??」ツ?ョテ」ツ?ォ)]テ」ツ?古」ツ?催」ツ?淌・ツ?エテ・ツ青?
		    if(charData[i] == ')'){
			check = false;
		    }
		    if(charData[i] == ']'){
			check = false;
		    }
		}
	    }
	    
	    System.out.println(st.empty() && check ? "yes" : "no");

	    check=true;
	}
    }
}