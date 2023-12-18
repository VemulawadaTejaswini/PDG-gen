import java.util.Scanner;
class Main{
    public static void main(String[] args){
	String s;
	int flag;
	Scanner in = new Scanner(System.in);
	while(true){
	    s = in.next();
	    if(s.equals("#"))break;
	    char ch[] = s.toCharArray();
	    int coun=0;
	    if((ch[0]>='a' && ch[0]<='g') || (ch[0]>='q' && ch[0]<='t') ||(ch[0]>='v' && ch[0]<='x') || ch[0] == 'z')flag=0;
	    else flag=1;
	    for(int i=0;i<s.length();i++){
		if( ( (ch[i]>='a' && ch[i]<='g') || (ch[i]>='q' && ch[i]<='t') ||(ch[i]>='v' && ch[i]<='x') || ch[i] == 'z') && flag == 1 ){coun++;
		    flag = 0;
		    continue;
		}	else if( !((ch[i]>='a' && ch[i]<='g') || (ch[i]>='q' && ch[i]<='t') ||(ch[i]>='v' && ch[i]<='x') || ch[i] == 'z') && flag == 0){coun++;
		    flag = 1;
		    continue;
		}
	    }
	    System.out.println(coun);
	}
    }
}