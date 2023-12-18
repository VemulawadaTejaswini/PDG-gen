import java.util.*;
class Main{
    void run(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    LinkedList<Character> stack=new LinkedList<Character>();
	    char[] ch=sc.nextLine().toCharArray();
	    if(ch.length==1&&ch[0]=='.')break;
	    boolean f=true;
	    for(int i=0;i<ch.length;i++){
		if(ch[i]=='('||ch[i]=='[')stack.push(ch[i]);
		else if(ch[i]==')'){
		    if(stack.size()==0||stack.pop()!='('){
			f=false;
			break;
		    }
		}
		else if(ch[i]==']'){
		    if(stack.size()==0||stack.pop()!='['){
			f=false;
			break;
		    }
		}
	    }
	    if(f&&stack.size()==0)System.out.println("yes");
	    else System.out.println("no");
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}