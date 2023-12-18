public class Main{
public static void main(String[] args){
  boolean result = false;
int D;
int T;
int S;
String in = System.in.read();
String[] ins = in.split(" ");
D = ins[0];
T = ins[1];
S = ins[2];
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
