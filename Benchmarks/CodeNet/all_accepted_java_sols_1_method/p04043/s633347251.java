import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException {

BufferedReader br =new BufferedReader (new InputStreamReader (System.in));

String line = br.readLine( );
String[] list = line.split(" ");
int x = Integer.parseInt(list[0]);
int a = Integer.parseInt(list[1]);
int y=Integer. parseInt(list[2]);

String h="NO";

if(x==5|x==7|a==5|a==7|y==5|y==7){
if(x+y+a==17){
h="YES";
}}

System. out. println(h);

}}
