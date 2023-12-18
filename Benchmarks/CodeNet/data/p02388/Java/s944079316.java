import java.io.IOException;
class Main{
    public static void main(String[] args){
       for(i=0; i<4; i++){
          try{
             int x=System.in.read();
             int a =x*x*x;
             System.out.println(a);
          }catch(IOException e){
          }
       }
    }
}