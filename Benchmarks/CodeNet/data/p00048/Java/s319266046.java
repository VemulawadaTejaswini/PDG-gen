import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
double weight;
while((line=br.readLine())!=null){
weight=Double.parseDouble(line);
classOfBoxing(weight);
System.out.println("");
}
}
private static void classOfBoxing(double n){
if(n<=48.00){
System.out.print("light fly");
}
else if(n<=51.00){
System.out.print("fly");
}
else if(n<=54.00){
System.out.print("bantam");
}
else if(n<=57.00){
System.out.print("feather");
}
else if(n<=60.00){
System.out.print("light");
}
else if(n<=64.00){
System.out.print("light welter");
}
else if(n<=69.00){
System.out.print("welter");
}
else if(n<=75.00){
System.out.print("light middle");
}
else if(n<=81.00){
System.out.print("middle");
}
else if(n<=91.00){
System.out.print("light heavy");
}
else{
System.out.print("heavy");
}
}
}