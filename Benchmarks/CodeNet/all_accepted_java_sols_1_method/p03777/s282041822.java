import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	char c1[]=sc.next().toCharArray();
	char c2[]=sc.next().toCharArray();
int i1,i2;
i1=1;
i2=1;
if(c1[0]=='D'){
	i1=-1;
}
if(c2[0]=='D'){
	i2=-1;
}
if(i1*i2>0){
	System.out.println("H");
}else{
	System.out.println("D");
}
	}}