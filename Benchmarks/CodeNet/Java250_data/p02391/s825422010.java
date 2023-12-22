import java.util.Scanner;

class Main{
    static int judge(int a,int b){
	int cnt=0;
	if(a<b){
	    return cnt;
	}
	cnt++;
	if(a>b){
	    return cnt;
	}
	cnt++;
	return cnt;
    }

    public static void main(String args[]){
	String s[]={" < "," > "," == "};

	Scanner scan=new Scanner(System.in);

	int a=scan.nextInt();
	int b=scan.nextInt();
	int ans=judge(a,b);

	System.out.println("a"+s[ans]+"b");
    }
}