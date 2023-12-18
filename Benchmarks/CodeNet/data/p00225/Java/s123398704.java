import java.util.*;

// JavaÅQueueÌCuIÈ¨ðmçÈ¢ÌÅTEKITOUÉÂ­é
// ÝéÌÍÅÆÅã¾¯Å¢¢
// CÍ


class Main{

    public static char[][] dc = new char[10100][2];
    public static char[] Que = new char[100000];
    public static int ct=0;

    public static void main(String[] args){//mainÍÇ¿çÜÅH
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


    }//mainÍ±¿çÜÅII

    public static int solve(int n){
	insert(dc[0][1]);
	char oh;
	int ok=0;

	while(empty() == 1){
	    oh = front();
	    pop();

	    if(oh == dc[0][0]){
		ok=1;
		break;
	    }

	    for(int i=0;i<n;i++){
		if(dc[i][0] == oh){
		    insert(dc[i][1]);
		}
	    }

	}	

	if(ok == 1)return 1;
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