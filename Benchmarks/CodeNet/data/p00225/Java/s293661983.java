import java.util.*;

//ツ姪淞づづつォツつスツ篠楪づ鋭inzuiツつェツ渉可甘コツ可サツつウツづェツづ按つ「


class Main{

    public static char[][] dc = new char[10100][2];
    public static char[] Que = new char[100000];
    public static int ct=0;

    public static void main(String[] args){//mainツづ債づつソツづァツづ慊づ？
	int n;
	String s;
	char[] ch = new char[10000];

	Scanner in = new Scanner(System.in);

	while(true){

	n = in.nextInt();

	if(n == 0)break;

	for(int i=0;i<n;i++){
	    s = in.next();
	    ch = s.toCharArray();
	    dc[i][0] = ch[0];
	    dc[i][1] = ch[s.length()-1];
	}

	if(solve(n) == 1)System.out.println("OK");
	else System.out.println("NG");


	}


    }//mainツづ債つアツつソツづァツづ慊づ！ツ！

    public static int solve(int n){
	insert(dc[0][1]);
	char oh;
	int ok=0;
	int ok2=1;
	int[] sinzui = new int[n];
	for(int i=0;i<n;i++)sinzui[i]=0;
	sinzui[0] = 1;

	while(empty() == 1){
	    // System.out.println("oh = " +front());
	    ok2=1;
	for(int i=0;i<n;i++){
	    if(sinzui[i] != 1)ok2=0;
	    // System.out.println("sinzui["+ i + "] = " +sinzui[i]);
	}
	// System.out.println("empty() == " + empty());

	    oh = front();
	
	    pop();
	   

	    if(oh == dc[0][0] && ok2 == 1 ){
		ok=1;
		break;
	    }

	    for(int i=0;i<n;i++){
		if(dc[i][0] == oh && sinzui[i] == 0){
		    insert(dc[i][1]);
		    //	    System.out.println("ct = " + ct);
		    sinzui[i]=1;
		}
	    }
	    //System.out.println("2empty() == " + empty());
	}
	

	
	//	System.out.println("ok = " + ok + ", ok2 = " + ok2);
	//	System.out.println("dc[0][0] = " + dc[0][0]);

	if(ok == 1 && ok2 == 1)return 1;
	else return 0;

    }

    public static void insert(char c){
	Que[ct]=c;
	ct++;
    }

    public static void pop(){
	ct--;
	Que[ct]='\0';
    }

    public static char front(){
	return Que[ct-1];
    }

    public static int empty(){
	if(ct == 0)return 0;
	else return 1;
    }




}