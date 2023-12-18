import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
float weight;
while((line=br.readLine())!=null){
weight=Float.parseFloat(line);
classOfBoxing(weight);
}
}
private static void classOfBoxing(float w){
PrintWriter p=new PrintWriter(System.out);
w=Math.ceil(w);
if(w<=48){
p.println("light fly");
}
else if(w<=51){
p.println("fly");
}
else if(w<=54){
p.println("bantam");
}
else if(w<=57){
p.println("feather");
}
else if(w<=60){
p.println("light");
}
else if(w<=64){
p.println("light welter");
}
else if(w<=69){
p.println("welter");
}
else if(w<=75){
p.println("light middle");
}
else if(w<=81){
p.println("middle");
}
else if(w<=91){
p.println("light heavy");
}
else{
p.println("heavy");
}
}
}