import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
double weight;
while((line=br.readLine())!=null){
weight=Double.parseDouble(line);
classOfBoxing(weight);
}
}
private static void classOfBoxing(double n){
if(n<=48.00){
System.out.println("light fly");
}
else if(n>48.00 &&n<=51.00){
System.out.println("fly");
}
else if(n>51.00 &&n<=54.00){
System.out.println("bantam");
}
else if(n>54.00 &&n<=57.00){
System.out.println("feather");
}
else if(n>57.00 &&n<=60.00){
System.out.println("light");
}
else if(n>60.00 &&n<=64.00){
System.out.println("light welter");
}
else if(n>64.00 &&n<=69.00){
System.out.println("welter");
}
else if(n>69.00 &&n<=75.00){
System.out.println("light middle");
}
else if(n>75.00 &&n<=81.00){
System.out.println("middle");
}
else if(n>81.00 &&n<=91.00){
System.out.println("light heavy");
}
else{
System.out.println("heavy");
}
}
}