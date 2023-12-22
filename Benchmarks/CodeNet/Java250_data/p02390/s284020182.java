import java.util.Scanner;

class Main{
    static void printwatch(int s){
	int h=s/3600;
	int m=(s%3600)/60;
	int sa=s%60;

	System.out.println(h+":"+m+":"+sa);
    }
    
    public static void main(String args[]){
	Scanner scan=new Scanner(System.in);

	int s=scan.nextInt();
	printwatch(s);
    }
}