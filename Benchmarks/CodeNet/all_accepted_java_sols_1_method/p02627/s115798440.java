import java.util.Scanner;
class Main{
    public static void main(String []args){
          Scanner input=new Scanner(System.in);
      String temp=input.next();
      if(temp.toLowerCase().equals(temp)){
        System.out.print("a");
      }else{
        System.out.print("A");
      }
    }
}