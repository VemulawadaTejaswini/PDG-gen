import java.util.Scanner;
class Main{

	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a;
int b;
int d=1;
for(int e = String.valueOf(d).length();e!=0;){
	a = sc.nextInt();
	b = sc.nextInt();
int len1 = String.valueOf(a).length(); 
int len2 = String.valueOf(b).length();
if(len1 == 0){
	d = 0;
}

System.out.println(len1+len2);
}


    }
}