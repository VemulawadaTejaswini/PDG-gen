import java.io.IOException;
class Main{
    public static void main(String[] args){
int x;
int a;
try{
x=System.in.read();
a=x*x*x;
          }catch(IOException e){
          }
System.out.println(a);
    }
}