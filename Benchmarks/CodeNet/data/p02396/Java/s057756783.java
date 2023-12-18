import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
scan.useDelimiter("\\r\\n");
int x=scan.nextInt();
int i=1;
while(x!=0){
System.out.println("Case "+i+": "+x);
i++;
}
}
}