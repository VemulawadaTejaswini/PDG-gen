import java.util.Scanner;

class Main{
    public static char grade_1(int m,int f){
	if(m==-1 || f==-1) return 'F';
	if(m+f>=80) return 'A';
	else if(m+f>=65) return 'B';
	else if(m+f>=50) return 'C';	
	else if(m+f>=30) return 'D';
	else return 'F';
    }

    public static char grade_2(int r){
	if(r>=50) return 'C';
	else return 'D';
    }
    
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	while(true){
	    int m = sc.nextInt();
	    int f = sc.nextInt();
	    int r = sc.nextInt();
	    if(m==-1 && f==-1 && r==-1) break;
	    char g=grade_1(m,f);
	    if(g=='D') g=grade_2(r);
	    System.out.println(g);
	}
    }
}