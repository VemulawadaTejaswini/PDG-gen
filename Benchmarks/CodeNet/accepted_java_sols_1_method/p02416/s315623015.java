import java.util.Scanner;
class Main {

  public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
for(;;) {
	String str=sc.next();
	if(str.equals("0"))break;
	char[] ch= str.toCharArray();
	int sum=0;
	for(int i=0;i<ch.length;i++) {
		int num=Character.getNumericValue(ch[i]);
		sum+=num;

	}
System.out.println(sum);
}
sc.close();
  }


}
