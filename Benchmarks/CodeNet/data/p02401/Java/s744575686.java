import java.io.*;
class Main{
public static void main(String[] args){
String[] data = new String[3];
int output = 0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
try {
while (true){
data = (br.readLine()).split(" ");
if (data[1].equals("?")) break;
switch(data[1]){
case "+":
output = Integer.parseInt(data[0]) + Integer.parseInt(data[2]);
break;
case "-":
output = Integer.parseInt(data[0]) - Integer.parseInt(data[2]);
break;
case "*":
output = Integer.parseInt(data[0]) * Integer.parseInt(data[2]);
break;
case"/":
output = Integer.parseInt(data[0]) / Integer.parseInt(data[2]);
break;
}
System.out.println(output);
}
} catch (IOException e) {
e.printStackTrace();
} finally {
try {
br.close();
} catch(IOException e) {
e.printStackTrace();
}
}
}
}