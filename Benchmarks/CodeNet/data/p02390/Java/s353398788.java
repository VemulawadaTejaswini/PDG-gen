import java.util.Scanner;
class Main{
    public static void main(String[] av){
	Scanner sc=new Scanner(System.in);
	int S=sc.nextInt();
	int h=0,m=0,s=0;
	h=S/(60*60);
	m=(S-h*60*60)/60;
	s=S-h*60*60-m*60;
	System.out.println(h+":"+m+":"+s);
    }
}

