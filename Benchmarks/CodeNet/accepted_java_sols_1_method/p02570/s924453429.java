import java.util.Scanner;
public class Main{
	public static void main(String[] args){
  boolean result = false;
int D;
int T;
int S;
  
  Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();

String[] ins = in.split(" ");
D = Integer.parseInt(ins[0]);
T = Integer.parseInt(ins[1]);
S = Integer.parseInt(ins[2]);
result = (D <= T*S);
String output;
if(result){
  output = "Yes";
}else{
  output = "No";
}
System.out.println(output);
  
};
}
