import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
class Main{
public static void main(String[] args){
BufferedReader br=new BufferedReader(new FileReader(System.in));
int x,i =1;
while((x=br.readLine()) != 0){
System.out.println("Case "+i+": "+x);
i++;
}
br.close();
}} 