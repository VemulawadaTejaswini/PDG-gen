import java.io.IOException;
class Main{
    public static void main(String[] args){
          int x;
          try{
             x=System.in.read();
             int a =x*x*x;
             System.out.println(a);
          }catch(IOException e){
          }
    }
}