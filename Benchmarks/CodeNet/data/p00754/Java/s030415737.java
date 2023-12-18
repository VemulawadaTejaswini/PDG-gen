import java.util.*;
class Main{
    void run(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    LinkedList<Character> stack=new LinkedList<Character>();
	    char[] ch=sc.nextLine().toCharArray();
	    if(ch[0]=='.')break;
	    int i;
	    for(i=0;i<ch.length;i++){
		if(ch[i]=='('||ch[i]=='[')stack.push(ch[i]);
		else if(ch[i]==')'){
		    if(stack.size()==0||stack.pop()!='('){
			System.out.println("no");
			break;
		    }
		}
		else if(ch[i]==']'){
		    if(stack.size()==0||stack.pop()!='['){
			System.out.println("no");
			break;
		    }
		}
	    }
	    if(i==ch.length&&stack.size()==0)System.out.println("yes");
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}