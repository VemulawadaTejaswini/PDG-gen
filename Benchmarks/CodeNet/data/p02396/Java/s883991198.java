import java.io.*; 
class Main {
public static void main(String[] args){
BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
int i=0;
int x;
while((x=Integer.parseInt(br.readLine())) != 0){
i++;
System.out.println("Case " +i+ ": " + x);
}
}
}